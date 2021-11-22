package org.barzykin.ita.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group implements Printable {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
