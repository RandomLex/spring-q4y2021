package org.barzykin.ita.spring.model;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXmlPropertiesAutowiring {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans-with-properties-autowiring.xml");
        ctx.registerShutdownHook();

        Group ee = ctx.getBean("ee", Group.class);
        ee.print();

    }
}
