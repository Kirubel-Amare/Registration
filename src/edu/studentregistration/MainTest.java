package edu.studentregistration;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class MainTest {

    @Test
    public void studentTest() {
        var studentTest=new student();

        studentTest.setFullName("kiru");
        Assert.assertEquals("kiru",studentTest.getFullName());

        studentTest.setAge(12);
        Assert.assertEquals(12,studentTest.getAge());

        studentTest.displayInformation();



    }
    @Test
    public void regularStudentTest(){
        var regularStudentTest=new regularStudent();

        regularStudentTest.setExamResult(500);
        Assert.assertEquals(500,regularStudentTest.getExamResult());



    }
    @Test
    public void seniorStudentTest(){
        var seniorStudentTest=new seniorStudent();

        seniorStudentTest.setGPA(3.6);
        Assert.assertEquals(3.6,seniorStudentTest.getGPA());

        seniorStudentTest.setCampus("main");
        Assert.assertEquals("main",seniorStudentTest.getCampus());


    }
    @Test

    public void distanceStudentTest(){
        var distanceStudentTest=new distanceStudent();

        distanceStudentTest.setLocation("deneba");
        Assert.assertEquals("deneba",distanceStudentTest.getLocation());

    }
}