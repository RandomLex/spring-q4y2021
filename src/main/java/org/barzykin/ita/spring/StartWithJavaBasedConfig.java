package org.barzykin.ita.spring;

import org.barzykin.ita.spring.model.Group;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWithJavaBasedConfig {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext("org.barzykin.ita.spring");
        ctx.registerShutdownHook();

        Group ee = ctx.getBean("ee", Group.class);
        ee.print();

    }
}
