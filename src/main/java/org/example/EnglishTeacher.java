package org.example;

import org.springframework.stereotype.Component;

@Component
public class EnglishTeacher implements TeacherDetails {

    public  void  details(){
        System.out.println("I am Kumar");
    }
}
