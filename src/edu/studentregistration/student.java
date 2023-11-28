package edu.studentregistration;

import java.util.ArrayList;

// creating  student class
public class student {
    private String fullName;
    private int age;
    private String sex;
    private String department;
    private double GPA;

  // creating  Constructors of student class with parameter

    public student(String fullName, int age, String sex, String department) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.department = department;
    }

    //creating  Constructors of student class with no parameter
    public student() {

    }

    //getter and setter
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //creating methods to display information about student using array list
    public void displayInformation() {
        System.out.println(getFullName().toUpperCase() + " HAS BEEN REGISTERED FOR  ");
        System.out.println(getDepartment()+ " DEPARTMENT TO THIS SEMESTER SUCCESSFULLY !!");
    }
    public String toString() {
        return fullName;
    }
    public static void displayRegisteredStudents(ArrayList<student> students) {
        System.out.println(" Registered students:");
        for (var student : students) {
            System.out.println(student.toString());
        }
    }
        public static void displayRegisteredMenu () {
            System.out.println("\n///....WELL COME TO HARAMAYA UNIVERSITY REGISTRATION SYSTEM..../// ");
            System.out.println("                         CHOOSE AN OPTION ");
            System.out.println("************************************************************************");
            System.out.println("                 1.NEW STUDENT REGISTRATION");
            System.out.println("                 2.SENIOR STUDENT REGISTRATION");
            System.out.println("                 3.REGISTERED STUDENT ");
            System.out.println("                 4.SYSTEM EXIT ");
            System.out.println("*********************************************************************************");
            System.out.print("ENTER YOUR CHOICE: ");
        }
        public static void displayRegisteredMenu2() {
            System.out.println("**************************");
            System.out.println("1.REGULAR STUDENT");
            System.out.println("2.DISTANCE STUDENT");
            System.out.println("3.SYSTEM EXIT");
            System.out.println("**************************");
        }
    }

