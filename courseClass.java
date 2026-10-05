

    public class courseClass {
        // fields
        private String courseName;
        private String[] students;
        private int numberOfStudents;

        public courseClass(String courseName) {
            this.courseName = courseName;
            this.students = new String[4];
            this.numberOfStudents = 0;
        }

        // getters
        public String getCourseName() {
            return courseName;
        }

        public String[] getStudents() {
            return students;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        // add student
        public void addStudent(String student) {

            if (numberOfStudents >= students.length) {
                String[] newStudents = new String[students.length * 2];

                for (int i = 0; i < students.length; i++) {
                    newStudents[i] = students[i];
                }

                students = newStudents;
            }

            students[numberOfStudents] = student;
            numberOfStudents++;
        }

        // drop student
        public void dropStudent(String student) {

            for (int i = 0; i < numberOfStudents; i++) {

                if (students[i].equals(student)) {

                    for (int j = i; j < numberOfStudents - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[numberOfStudents - 1] = null;
                    numberOfStudents--;

                    break;
                }
            }
        }

        public static void main(String[] args) {

            courseClass course = new courseClass("Java");

            course.addStudent("Ahmed");
            course.addStudent("Ali");
            course.addStudent("Hassan");

            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Number of Students: "
                    + course.getNumberOfStudents());

            System.out.println("Students:");

            for (int i = 0; i < course.getNumberOfStudents(); i++) {
                System.out.println(course.getStudents()[i]);
            }

            course.dropStudent("Ali");

            System.out.println("After dropping Ali:");

            for (int i = 0; i < course.getNumberOfStudents(); i++) {
                System.out.println(course.getStudents()[i]);
            }
        }
    }

