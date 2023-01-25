package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EnglishTeacher implements TeacherDetails {
    public  void TeacherName(){
        System.out.println("Iam Pavan");
    }
    public  void  details(){
        System.out.println("I teach English Subject");
    }
}
