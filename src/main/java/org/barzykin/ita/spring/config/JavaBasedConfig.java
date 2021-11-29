package org.barzykin.ita.spring.config;


import org.barzykin.ita.spring.model.Group;
import org.barzykin.ita.spring.model.Student;
import org.barzykin.ita.spring.model.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@PropertySource({"classpath:students.properties", "classpath:teachers.properties"})
public class JavaBasedConfig {
    @Value("${john.id}")
    private int johnId;
    @Value("${john.name}")
    private String johnName;
    @Value("#{${john.marks}}")
    private Map<String, Integer> johnMarks;


    @Bean
    public Group ee(Teacher alex, List<Student> eeStudents) {
        Group ee = new Group(1, "EE", null);
        ee.setTeacher(alex);
        ee.setStudents(eeStudents);
        return ee;
    }

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

    @Bean
    public Teacher alex(@Value("${alex.id}") int id,
                        @Value("${alex.name}") String name,
                        @Value("${alex.certificates}") List<String> certificates ) {
        Teacher alex = new Teacher(id, name, 100);
        alex.setCertificates(certificates);
        return alex;
    }

    @Bean
    public Teacher anton() {
        Teacher anton = new Teacher(2, "Anton", 80);
        anton.setCertificates(List.of("Java", "JEE"));
        return anton;
    }

}
