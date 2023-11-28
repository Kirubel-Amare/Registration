package edu.studentregistration;


//senior student class extends or inherited from student class
    public class seniorStudent extends student {
        private double GPA;
        private String studentID;
        private String campus;

        public seniorStudent() {

        }

        //setter and getter of seniorStudent class

        public String getStudentID() {
            return this.studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public double getGPA() {
            return this.GPA;
        }

        public void setGPA(double GPA) {
            this.GPA = GPA;
        }

        public String getCampus() {
            return this.campus;
        }

        public void setCampus(String campus) {
            this.campus = campus;
        }


        // creating  Constructors of senior class with parameter
        public seniorStudent(String fullName, int age, String studentID, String sex, String department, double GPA, String campus) {
            super(fullName, age, sex, department);
            this.GPA = GPA;
        }

        // methods that override from student class
    @Override
        public  void displayInformation() {
            System.out.println("*************************************");
            super.displayInformation();
            System.out.println("STUDENT CAMPUS: "+getCampus());
            System.out.println("STUDENT TYPE:SENIOR");
            System.out.println("*************************************");
        }

    }
