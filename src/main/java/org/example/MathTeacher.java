package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements TeacherDetails {

    public  void  details(){
        System.out.println("I am Kishor");
    }


}
