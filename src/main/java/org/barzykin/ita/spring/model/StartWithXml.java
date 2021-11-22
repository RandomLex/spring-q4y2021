package org.barzykin.ita.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXml {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        Student john = (Student) ctx.getBean("john");
//        john.print();

        Group ee = ctx.getBean("ee", Group.class);
        ee.print();
    }
}
