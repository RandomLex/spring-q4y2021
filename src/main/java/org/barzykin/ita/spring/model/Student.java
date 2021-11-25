package org.barzykin.ita.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class Student extends Person {
    private Map<String, Integer> marks;

    public Student(int id, String name, Map<String, Integer> marks) {
        super(id, name);
        this.marks = marks;
    }
}
