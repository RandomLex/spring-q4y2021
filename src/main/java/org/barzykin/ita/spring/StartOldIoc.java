package org.barzykin.ita.spring;

import org.barzykin.ita.spring.model.Group;
import org.barzykin.ita.spring.model.Student;
import org.barzykin.ita.spring.model.Teacher;

import java.util.List;

public class StartOldIoc {
    public static void main(String[] args) {
        Student john = new Student(1, "John", List.of(8, 9, 10));
        Student bob = new Student(1, "Bob", List.of(7, 8, 9));
        Teacher alex = new Teacher(1, "Alex", 100);

        Group ee = new Group(1, "EE", alex, List.of(john, bob));

        ee.print();
    }
}
