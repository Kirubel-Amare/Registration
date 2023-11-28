package edu.studentregistration;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
           // Create a Scanner object for user input
            var scanner = new Scanner(System.in);

            // Create an ArrayList to store student objects
            ArrayList<student> students = new ArrayList<>();

             while (true) {
             student.displayRegisteredMenu();

            int choice;
            while (true) {
                try {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 5) {
                        break;
                    } else {
                        System.out.print("PLEASE ENTER A VALID CHOICE!!");
                    }
                } catch (InputMismatchException EX) {
                    System.out.println("INVALID CHOICE: " + EX.getMessage());
                    scanner.nextLine();
                }
            }
                 if (choice == 1) {

                    student.displayRegisteredMenu2();
                    int choice2 = scanner.nextInt();
                    scanner.nextLine();

                   // user deride to input the information below

                    if (choice2 == 1) {
                        System.out.println("PLEASE PROVIDE THE FOLLOWING INFORMATION ");
                        System.out.println("**********************************************");

                        System.out.print("ENTER STUDENT FULL NAME : ");
                        String fullName;
                        while (true) {
                            try {
                                fullName = scanner.nextLine();
                                if (fullName.matches("[a-zA-Z]+")) {
                                    break;
                                } else {
                                    System.out.print(" PLEASE ENTER VALID NAME!!");
                                }
                            } catch (Exception EX) {
                                System.out.println("INVALID NAME:" + EX.getMessage());
                                scanner.nextLine();
                            }
                        }
                        System.out.print("ENTER STUDENT AGE: ");
                        int age;
                        while (true) {
                            try {
                                age = scanner.nextInt();
                                scanner.nextLine();
                                if (age > 0) {
                                    break;
                                } else {
                                    System.out.println(" PLEASE ENTER VALID AGE!!");
                                }
                            } catch (Exception EX) {
                                System.out.print(EX.getMessage());
                                scanner.nextInt();
                            }
                        }
                        System.out.print("ENTER YOUR SEX (M/F): ");
                        String sex;
                        while (true) {
                            try {
                                sex = scanner.nextLine();
                                if (sex.equals("M") || sex.equals("F")) {
                                    break;
                                } else {
                                    System.out.println(" PLEASE ENTER ONLY 'M' or 'F'.");
                                }
                            } catch (Exception EX) {
                                System.out.println("INVALID VALUE:: " + EX.getMessage());
                                scanner.nextLine();
                            }
                        }
                        System.out.print("ENTER ENTRANCE EXAM RESULT: ");
                        int result;
                        while (true) {
                            try {
                                result = scanner.nextInt();
                                scanner.nextLine();
                                if ((result >= 350) && (result <= 700)) {
                                    break;
                                } else {
                                    System.out.println(" PLEASE ENTER VALID RESULT!!");
                                }
                            } catch (Exception EX) {
                                System.out.print(EX.getMessage());
                                scanner.nextInt();
                            }
                        }
                        System.out.print("\nCHOOSE YOUR DEPARTMENT FROM THE FOLLOWING:");
                        String[] departments = {"  ", "1.SOFTWARE ENGINEERING", "2.COMPUTER SCIENCE", "3.INFORMATION SCIENCE", "4.LAW ", "5.CIVIL ENGINEERING"};
                        for (String department : departments)
                            System.out.println(department);

                        int index = scanner.nextInt();
                        scanner.nextLine();
                        while (index <= 0 || index >= departments.length) {
                            System.out.println("PLEASE ENTER A VALUE BETWEEN 1 AND " + (departments.length - 1));
                            index = scanner.nextInt();
                            scanner.nextLine();

                        }var regularStudent = new regularStudent(fullName, age, sex, departments[index], result);
                        students.add(regularStudent);
                        regularStudent.displayInformation();

                    } else if (choice2 == 2) {
                        System.out.println("PLEASE PROVIDE THE FOLLOWING INFORMATION ");
                        System.out.println("**********************************************");

                        System.out.print("ENTER STUDENT FULL NAME : ");
                        String fullName;
                        while (true) {
                            try {
                                fullName = scanner.nextLine();
                                if (fullName.matches("[a-zA-Z]+")) {
                                    break;
                                } else {
                                    System.out.print(" PLEASE ENTER VALID NAME!!");
                                }
                            } catch (Exception EX) {
                                System.out.println("INVALID NAME:" + EX.getMessage());
                                scanner.nextLine();
                            }
                        }

                        System.out.print("ENTER STUDENT AGE: ");
                        int age;
                        while (true) {
                            try {
                                age = scanner.nextInt();
                                scanner.nextLine();
                                if (age > 0) {
                                    break;
                                } else {
                                    System.out.print(" PLEASE ENTER VALID AGE!!");
                                }
                            } catch (Exception EX) {
                                System.out.print(EX.getMessage());
                                scanner.nextInt();
                            }
                        }
                        System.out.print("ENTER YOUR SEX (M/F): ");
                        String sex;
                        while (true) {
                            try {
                                sex = scanner.nextLine();
                                if (sex.equals("M") || sex.equals("F")) {
                                    break;
                                } else {
                                    System.out.println(" PLEASE ENTER ONLY 'M' or 'F'.");
                                }
                            } catch (Exception EX) {
                                System.out.println("Error: " + EX.getMessage());
                                scanner.nextLine();
                            }
                        }
                        System.out.print("ENTER YOUR LOCATION:");
                        String location = scanner.nextLine();

                        System.out.print("\nCHOOSE YOUR DEPARTMENT FROM THE FOLLOWING:");
                        String[] departments = {"  ", "1.SOFTWARE ENGINEERING", "2.COMPUTER SCIENCE", "3.INFORMATION SCIENCE", "4.LAW ", "5.CIVIL ENGINEERING"};
                        for (String department : departments)
                            System.out.println(department);
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        while (index <= 0 || index >= departments.length) {
                            System.out.println("PLEASE ENTER A VALUE BETWEEN 1 AND " + (departments.length - 1));
                            index = scanner.nextInt();
                            scanner.nextLine();

                        }var distanceStudent = new distanceStudent(fullName, age, sex, departments[index], location);
                        students.add(distanceStudent);
                        distanceStudent.displayInformation();

                    } else if (choice2 == 3) {
                        System.out.println("GOODE BY !!");
                        System.exit(0);
                    } else {
                        System.out.println("INVALID  CHOICE!! PLEASE CHOOSE 1 ,2 OR 3\n");
                        scanner.nextLine();
                    }
                } else if (choice == 2) {
                    System.out.println("PLEASE PROVIDE THE FOLLOWING INFORMATION ");
                    System.out.println("*********************************************");
                    System.out.print("ENTER STUDENT FULL NAME : ");
                    String fullName=scanner.nextLine();
                    while (true) {
                        try {
                            fullName = scanner.nextLine();
                            if (fullName.matches("[a-zA-Z]+")) {
                                break;
                            } else {
                                System.out.print(" PLEASE ENTER VALID NAME!!");
                            }
                        } catch (Exception EX) {
                            System.out.println("INVALID NAME:" + EX.getMessage());
                            scanner.nextLine();
                        }
                    }
                    System.out.print("ENTER STUDENT AGE: ");
                    int age;
                    while (true) {
                        try {
                            age = scanner.nextInt();
                            scanner.nextLine();
                            if (age > 0) {
                                break;
                            } else {
                                System.out.println(" PLEASE ENTER VALID AGE!!");
                            }
                        } catch (Exception EX) {
                            System.out.print(EX.getMessage());
                            scanner.nextInt();
                        }
                    }
                    System.out.print("ENTER YOUR SEX (M/F): ");
                    String sex;
                    while (true) {
                        try {
                            sex = scanner.nextLine();
                            if (sex.equals("M") || sex.equals("F")) {
                                break;
                            } else {
                                System.out.println(" PLEASE ENTER ONLY 'M' or 'F'.");
                            }
                        } catch (Exception EX) {
                            System.out.println("INVALID VALUE: " + EX.getMessage());
                            scanner.nextLine();
                        }
                    }
                    System.out.print("ENTER STUDENT ID:");
                    String studentID = scanner.nextLine();

                    System.out.print("ENTER YOUR CAMPUS: ");
                    String campus = scanner.nextLine();

                    System.out.print("ENTER LAST SEMESTER GPA :");
                    float GPA;
                    while (true) {
                        try {
                            GPA = scanner.nextFloat();
                            if (GPA > 0 && GPA <= 4) {
                                if ((double) GPA < 1.5) {
                                    System.out.println("YOU MUST HAVE 1.5 AND ABOVE GRADES.");
                                    System.exit(0);
                                }
                                break;
                            } else {
                                System.out.println(" PLEASE ENTER VALID GRADE");
                            }
                        } catch (Exception EX) {
                            System.out.println("INVALID VALUE:" + EX.getMessage());
                            scanner.nextLine();
                        }
                    }
                    System.out.print("\nCHOOSE YOUR DEPARTMENT FROM THE FOLLOWING:");
                    String[] departments = {"  ", "1.SOFTWARE ENGINEERING", "2.COMPUTER SCIENCE", "3.INFORMATION SCIENCE", "4.LAW ", "5.CIVIL ENGINEERING"};

                    for (String department : departments)
                        System.out.println(department);
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    while (index <= 0 || index >= departments.length) {
                        System.out.println("PLEASE ENTER A VALUE BETWEEN 1 AND " + (departments.length - 1));
                        index = scanner.nextInt();
                        scanner.nextLine();

                    }var seniorStudent = new seniorStudent(fullName, age, studentID, sex, departments[index], GPA, campus);
                    students.add(seniorStudent);
                    seniorStudent.displayInformation();

                } else if (choice == 3) {
                    // Display information about all registered students
                    student.displayRegisteredStudents(students);
                } else if (choice == 4) {
                    System.out.println("GOODBYE!!");
                    System.exit(0);
                } else {
                    System.out.println("INVALID CHOICE!! PLEASE CHOOSE 1, 2, 3, 4, OR 5\n");
                    scanner.nextLine();
                }
            }
        }
    }

