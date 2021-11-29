package org.barzykin.ita.spring.config;


import org.barzykin.ita.spring.model.Group;
import org.barzykin.ita.spring.model.Student;
import org.barzykin.ita.spring.model.Teacher;
import org.barzykin.ita.spring.qualifiers.CustomStringQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
@Import({StudentConfig.class, TeacherConfig.class})
public class JavaBasedConfig {

//    @Bean
//    public Group ee(@Qualifier("alex") Teacher teacher, List<Student> eeStudents) {
//    public Group ee(@CustomClassQualifier(clazz = Mentor.class) Teacher teacher, List<Student> eeStudents) {
//    public Group ee(@CustomStringQualifier(name = "abc") Teacher teacher, /*@Autowired */Student john, @Autowired Student bbb) {
//        Group ee = new Group(1, "EE", null);
//        ee.setTeacher(teacher);
//        ee.setStudents(List.of(john, bbb));
//        return ee;
//    }

}
