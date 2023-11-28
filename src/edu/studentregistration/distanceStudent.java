package edu.studentregistration;


//distanceStudent class extends or inherited from student class
    public class distanceStudent extends student {
        private String location;

    // creating  Constructors of distanceStudent class with no parameter
        public distanceStudent() {

        }
        public String getLocation() {
            return this.location;
        }
        public void setLocation(String location) {
            this.location = location;
        }

    // creating  Constructors of distanceStudent class with parameter
        public distanceStudent(String fullName, int age, String sex, String department, String location) {
            super(fullName, age, sex, department);
            this.location = location;
        }

    // methods that override from student class
        public void displayInformation() {
            System.out.println("*************************************");
            super.displayInformation();
            System.out.println("STUDENT LOCATION:" + this.location.toUpperCase());
            System.out.println("STUDENT TYPE :DISTANCE");
            System.out.println("*************************************");
        }
    }

