package chapter14;

public class StudentTest {

    static Student[] students = new Student[3];

    public static void test() {
        students[0] = new Student("Sixth student", 3, "sixth@mail.com", "678", Student.Spec.FINANCE);
        students[0].getStudentInfo();

        students[1] = new Student("Seventh student", 3, "seventh@mail.com", "6542", Student.Spec.IT, Student.Uni.SU);
        students[1].getStudentInfo();

        students[2] = new Student("Fifth student", 1, "fifth@mail.com", "12345678");
        students[2].getStudentInfo();

        System.out.println("Number of objects: " + Student.studentsCount);
    }

    public void getProperties() {
        Student student7 = new Student("John Dow", 3, "john@mail.com", "15973", Student.Spec.AUTO, Student.Uni.TU);
        System.out.println("Name " + student7.getFullName());

        student7.setFullName("Changed name");
        System.out.println("Name " + student7.getFullName());
        System.out.println("Number of objects: " + Student.studentsCount);
    }

    public static Student getStudent(int i) {
        return students[i];
    }
}
