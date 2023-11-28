package edu.studentregistration;

//regularStudent class extends or inherited from student class
    public class regularStudent extends student {
        private int examResult;
    // creating  Constructors of regularStudent class with  parameter
        public regularStudent() {
        }

        //setter and getter
        public int getExamResult() {
            return this.examResult;
        }
        public void setExamResult(int examResult) {
            this.examResult = examResult;
        }

    // creating  Constructors of regularStudent class with  parameter
        public regularStudent(String fullName, int age, String sex, String department, int examResult) {
            super(fullName, age, sex, department);
            this.examResult = examResult;
        }

        // methods that override from student class
        public void displayInformation() {
            System.out.println("******************************************");
            super.displayInformation();
            System.out.println("STUDENT EXAM RESULT:" + this.examResult);
            System.out.println("STUDENT TYPE :REGULAR");
            System.out.println("******************************************");
        }
    }

