package chapter20;

public class Student extends Human implements Comparable<Student> {

    private double grade;

    public double getGrade() {
        return grade;
    }

    public Student(double grade) {
        super();
        this.grade=grade;
    }

    public Student(String firstName, String familyName, double grade) {
        super(firstName, familyName);
        this.grade=grade;
    }

    public static void printInfo(Student[] students) {
        for (Student student : students) {
            System.out.printf("Student name: %s %s with grade %.2f%n", student.getFirstName(), student.getFamilyName(), student.getGrade());
        }
    }

    public int compareTo(Student o) {
        double studentGrade = grade;
        double anotherStudentGrade = o.getGrade();
        if (studentGrade<anotherStudentGrade) {
            return -1;
        } else if (studentGrade==anotherStudentGrade) {
            return 0;
        }
        return 1;
    }
}
