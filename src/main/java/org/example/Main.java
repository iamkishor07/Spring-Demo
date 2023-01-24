package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    // Spring core Annotations
    //component
    //Autowired
    //Configuration
    //primary used to mention if collsions occurs which need to execute first
    //Component Scan is used to scan entire mentioned directory or path
    //Quantifer used to mention the name which is going to execute if called

    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);

        Teacher math=factory.getBean(Teacher.class);

        math.show();

    }
 }