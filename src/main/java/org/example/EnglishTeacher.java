package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class EnglishTeacher implements TeacherDetails {
    public  void TeacherName(){
        System.out.println("Iam Pavan");
    }
    public  void  details(){
        System.out.println("I teach English Subject");
    }
    public  void  Address(){
        System.out.println("I live in mumbai");
    }
}
