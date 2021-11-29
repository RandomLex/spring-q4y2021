package org.barzykin.ita.spring.config;


import org.barzykin.ita.spring.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@PropertySource({"classpath:students.properties"})
public class StudentConfig {
    @Value("${john.id}")
    private int johnId;
    @Value("${john.name}")
    private String johnName;
    @Value("#{${john.marks}}")
    private Map<String, Integer> johnMarks;


    @Bean
    public List<Student> eeStudents(Student john, Student bbb) {
        List<Student> eeStudents = new ArrayList<>();
        eeStudents.add(john);
        eeStudents.add(bbb);
        return eeStudents;
    }

    @Bean
    public Student john() {
        Student john = new Student(johnId, johnName);
        john.setMarks(johnMarks);
        return john;
    }

    @Bean("bbb")
    public Student bob(@Value("${bob.id}") int id) {
        Student bob = new Student(id, "Bob");
        bob.setMarks(Map.of("Java", 7, "Python", 8, "C", 9));
        return bob;
    }
}
