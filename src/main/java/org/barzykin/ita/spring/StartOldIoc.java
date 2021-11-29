package org.barzykin.ita.spring;

import org.barzykin.ita.spring.model.Group;
import org.barzykin.ita.spring.model.Student;
import org.barzykin.ita.spring.model.Teacher;

import java.util.List;
import java.util.Map;

public class StartOldIoc {
    public static void main(String[] args) {
        Student john = new Student(1, "John", Map.of("Java", 8, "Python", 9, "C", 10));
        Student bob = new Student(1, "Bob", Map.of("Java", 7, "Python", 8, "C", 9));
        Teacher alex = new Teacher(1, "Alex", 100);

        Group ee = new Group(1, "EE", null, null, null, List.of(john, bob));

        ee.print();
    }
}
