package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring core Annotations
//component
//Autowired
//Configuration
//primary used to mention if collisions occurs which need to execute first
//Component Scan is used to scan entire mentioned directory or path
//Quantifer used to mention the name which is going to execute if called

public class Main {

    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);

        Teacher obj=factory.getBean(Teacher.class);
        obj.show();

    }
 }