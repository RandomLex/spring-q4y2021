package org.barzykin.ita.spring.config;


import org.barzykin.ita.spring.model.Group;
import org.barzykin.ita.spring.model.Student;
import org.barzykin.ita.spring.model.Teacher;
import org.barzykin.ita.spring.qualifiers.CustomStringQualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import({StudentConfig.class, TeacherConfig.class})
public class JavaBasedConfig {

    @Bean
//    public Group ee(@Qualifier("alex") Teacher teacher, List<Student> eeStudents) {
//    public Group ee(@CustomClassQualifier(clazz = Mentor.class) Teacher teacher, List<Student> eeStudents) {
    public Group ee(@CustomStringQualifier(name = "abc") Teacher teacher, List<Student> eeStudents) {
        Group ee = new Group(1, "EE", null);
        ee.setTeacher(teacher);
        ee.setStudents(eeStudents);
        return ee;
    }

}
