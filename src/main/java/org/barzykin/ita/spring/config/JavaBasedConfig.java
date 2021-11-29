package org.barzykin.ita.spring.config;


import org.barzykin.ita.spring.model.Group;
import org.barzykin.ita.spring.model.Student;
import org.barzykin.ita.spring.model.Teacher;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaBasedConfig {


    @Bean
    public Group ee(Teacher anton, List<Student> eeStudents) {
        Group ee = new Group(1, "EE", null);
        ee.setTeacher(anton);
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
        Student john = new Student(1, "John");
        john.setMarks(Map.of("Java", 8, "Python", 9, "C", 10));
        return john;
    }

    @Bean("bbb")
    public Student bob() {
        Student bob = new Student(2, "Bob");
        bob.setMarks(Map.of("Java", 7, "Python", 8, "C", 9));
        return bob;
    }

    @Bean
    public Teacher alex() {
        Teacher alex = new Teacher(1, "Alex", 100);
        alex.setCertificates(List.of("Java", "Spring", "AWS"));
        return alex;
    }

    @Bean
    public Teacher anton() {
        Teacher anton = new Teacher(2, "Anton", 80);
        anton.setCertificates(List.of("Java", "JEE"));
        return anton;
    }

}
