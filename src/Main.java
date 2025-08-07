class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0;
    double grade2 = 0;
    double grade3 = 0;

    double average = 0;
    boolean isPassing = false;


    public Student(String Studentname, int studentage, String Studentcourse, double Sgrade1, double Sgrade2, double Sgrade3, double Gaverage) {

        name = Studentname;
        age = studentage;
        course = Studentcourse;
        grade1 = Sgrade1;
        grade2 = Sgrade2;
        grade3 = Sgrade3;
        average = Gaverage;

        System.out.println("Student Information: ");
    }

    public void displayinfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("course: " + course);
        System.out.println("Grades: " + grade1 + grade2 + grade3);
    }

    public void calculateAverage() {
        average = (grade1 + grade2 + grade3) / 3;
    }

    public void getLetterGrade() {
        if (average >= 90) {
            System.out.println("letter grade: A");
        } else if (average >= 80) {
            System.out.println("letter grade: B");
        } else if (average >= 70) {
            System.out.println("letter grade: C");
        } else if (average >= 60) {
            System.out.println("letter grade: D");
        } else if (average < 60) {
            System.out.println("letter grade: F");
        }
    }

    public void isPassing() {
        if (average >= 70) {
            System.out.println("Status: PASSING");
        } else {
            System.out.println("Status: FAILED");
        }
    }
}
class Classmain {
    public static void main(String[] args) {
        System.out.println();
        Student student1 = new Student("Ron", 20);

    }
}




