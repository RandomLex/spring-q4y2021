package org.barzykin.ita.spring.config;


import org.barzykin.ita.spring.model.Group;
import org.barzykin.ita.spring.model.Student;
import org.barzykin.ita.spring.model.Teacher;
import org.barzykin.ita.spring.qualifiers.CustomStringQualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@PropertySource({"classpath:teachers.properties"})
public class TeacherConfig {

    @CustomStringQualifier(name = "cde")
//    @CustomClassQualifier(clazz = Mentor.class)
//    @Bean("qqq")
    @Bean
    public Teacher alex(@Value("${alex.id}") int id,
                        @Value("${alex.name}") String name,
                        @Value("${alex.certificates}") List<String> certificates ) {
        Teacher alex = new Teacher(id, name, 100);
        alex.setCertificates(certificates);
        return alex;
    }

    @CustomStringQualifier(name = "abc")
//    @CustomClassQualifier(clazz = Teacher.class)
    @Bean
    public Teacher anton() {
        Teacher anton = new Teacher(2, "Anton", 80);
        anton.setCertificates(List.of("Java", "JEE"));
        return anton;
    }

}
