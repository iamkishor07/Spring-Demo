package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements TeacherDetails {
    public void TeacherName(){
        System.out.println("Iam Kishor");
    }
    public  void  details(){
        System.out.println("I teach Math Subjects");
    }
    public  void  Address(){
        System.out.println("I live in Hyderabad");
    }


}
