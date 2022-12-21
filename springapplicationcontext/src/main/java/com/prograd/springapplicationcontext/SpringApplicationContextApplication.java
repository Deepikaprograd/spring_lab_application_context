package com.prograd.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringApplicationContextApplication {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {

        applicationContext = SpringApplication.run(SpringApplicationContextApplication.class, args);

        SpringApplicationContextApplication application = new SpringApplicationContextApplication();

        System.out.println(application.isBeanPresent(applicationContext.getBeanDefinitionNames(),
                "springApplicationContextApplication"));
    }

    public static boolean isBeanPresent(String[] beanNames, String bean) {
        for (String a : beanNames) {
            if (a.equals(bean))
                return true;
        }
        return false;
    }

}

