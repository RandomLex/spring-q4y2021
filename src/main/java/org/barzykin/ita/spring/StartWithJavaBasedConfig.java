package org.barzykin.ita.spring;

import org.barzykin.ita.spring.config.JavaBasedConfig;
import org.barzykin.ita.spring.model.Group;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithJavaBasedConfig {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(JavaBasedConfig.class);
        ctx.registerShutdownHook();

        Group ee = ctx.getBean("ee", Group.class);
        ee.print();

    }
}
