package org.barzykin.ita.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.barzykin.ita.spring.qualifiers.MentorQualifier;
import org.barzykin.ita.spring.qualifiers.TeacherQualifier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group implements Printable {
    private int id;
    private String name;
    @Autowired
    @MentorQualifier
    private Teacher teacher;
    private List<Student> students;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Group(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public void start() {
        System.out.println("Group " + name + " has been started.");
    }

//    public String finish(String sss) { //here shouldn't be parameters
    public String finish() {
        String str = "Group " + name + " has been finished.";
        System.out.println(str);
        return str;
    }
}
