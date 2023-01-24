package org.example;

import org.springframework.stereotype.Component;

@Component
public class EnglishTeacher implements TeacherDetails {
    public void display(){
        System.out.println("I am a English teacher ");
    }
    public  void  details(){
        System.out.println("I am Kumar");
    }
}
