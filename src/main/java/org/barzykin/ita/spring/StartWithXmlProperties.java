package org.barzykin.ita.spring;

import org.barzykin.ita.spring.model.Group;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXmlProperties {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans-with-properties.xml");
        ctx.registerShutdownHook();

        Group ee = ctx.getBean("ee", Group.class);
        ee.print();

    }
}
