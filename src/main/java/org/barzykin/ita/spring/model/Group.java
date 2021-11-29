package org.barzykin.ita.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.barzykin.ita.spring.qualifiers.CustomClassQualifier;
import org.barzykin.ita.spring.qualifiers.CustomStringQualifier;
import org.barzykin.ita.spring.qualifiers.MentorQualifier;
import org.barzykin.ita.spring.qualifiers.TeacherQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("ee")
@PropertySource("classpath:group.properties")
public class Group implements Printable {
    @Value("${group.ee.id}")
    private int id;
    @Value("${group.ee.name}")
    private String name;
//    @Autowired
//    @CustomClassQualifier(clazz = Teacher.class)
//    @MentorQualifier
//    @CustomStringQualifier(name = "cde")
//    @Value("#{qqq}")
//    @Value("#{alex}")

    private Teacher teacher;

    @Autowired
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Map<String, Teacher> teacherMap;
    @Value("${group.ee.teacher}")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private String teacherName;


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

    @PostConstruct
    public void start() {
        teacher = teacherMap.get(teacherName);
        System.out.println("Group " + name + " has been started.");
    }

//    public String finish(String sss) { //here shouldn't be parameters
    @PreDestroy
    public String finish() {
        String str = "Group " + name + " has been finished.";
        System.out.println(str);
        return str;
    }
}
