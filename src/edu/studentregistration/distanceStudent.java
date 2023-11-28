package edu.studentregistration;


    public class distanceStudent extends student {
        private String location;

        public distanceStudent() {

        }

        public String getLocation() {
            return this.location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public distanceStudent(String fullName, int age, String sex, String department, String location) {
            super(fullName, age, sex, department);
            this.location = location;
        }

        public void displayInformation() {
            System.out.println("*************************************");
            super.displayInformation();
            System.out.println("STUDENT LOCATION:" + this.location.toUpperCase());
            System.out.println("STUDENT TYPE :DISTANCE");
            System.out.println("*************************************");
        }
    }

