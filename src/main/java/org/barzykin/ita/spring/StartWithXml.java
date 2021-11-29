package org.barzykin.ita.spring;

import org.barzykin.ita.spring.model.Group;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXml {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        ctx.registerShutdownHook();
//        Student john = (Student) ctx.getBean("john");
//        john.print();

        Group ee = ctx.getBean("ee", Group.class);
        if (false) {
            throw new RuntimeException();
        }
        ee.print();

        Group testGroup = ctx.getBean("testGroup", Group.class);
        testGroup.print();

    }
}
