package edu.studentregistration;

    public class regularStudent extends student {
        private int examResult;

        public regularStudent() {

        }

        public int getExamResult() {
            return this.examResult;
        }

        public void setExamResult(int examResult) {
            this.examResult = examResult;
        }

        public regularStudent(String fullName, int age, String sex, String department, int examResult) {
            super(fullName, age, sex, department);
            this.examResult = examResult;
        }

        public void displayInformation() {
            System.out.println("******************************************");
            super.displayInformation();
            System.out.println("STUDENT EXAM RESULT:" + this.examResult);
            System.out.println("STUDENT TYPE :REGULAR");
            System.out.println("******************************************");
        }
    }

