package org.barzykin.ita.spring.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.barzykin.ita.spring.qualifiers.CustomClassQualifier;
import org.barzykin.ita.spring.qualifiers.CustomStringQualifier;
import org.barzykin.ita.spring.qualifiers.TeacherQualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@CustomClassQualifier(clazz = Teacher.class)
@TeacherQualifier
@Component("teacher")
public class Teacher extends Person {
    private int salary;
    private List<String> certificates;

    public Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    public Teacher(int id, String name) {
        super(id, name);
    }
}
