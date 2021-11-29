package org.barzykin.ita.spring.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.barzykin.ita.spring.qualifiers.CustomClassQualifier;
import org.barzykin.ita.spring.qualifiers.CustomStringQualifier;
import org.barzykin.ita.spring.qualifiers.MentorQualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@Component
@MentorQualifier
@CustomClassQualifier(clazz = Mentor.class)
public class Mentor extends Teacher {
    private int salary;
    private List<String> certificates;

    public Mentor(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    public Mentor(int id, String name) {
        super(id, name);
    }
}
