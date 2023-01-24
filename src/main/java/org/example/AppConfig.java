package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.example")
public class AppConfig {
//    @Bean
//    public MathTeacher getTeacher(){
//        return  new MathTeacher();
//    }
//
//    @Bean
//    public  TeacherDetails getTeacherDetails(){
//        return  new TeacherDetails();
//    }
}
