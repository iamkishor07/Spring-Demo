package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    @Autowired

    TeacherDetails teacherDetails;
    public  void Display(){
        System.out.println("The following Details are");
        teacherDetails.details();
        teacherDetails.TeacherName();
        teacherDetails.Address();
    }




    }

