package chapter14;

public class StudentTest {

    static Student student;
    static Student student2;
    static Student student3;

    public static void test() {
        student = new Student("Sixth student", 3, "sixth@mail.com", "678", "Finance");
        student.getStudentInfo();

        student2 = new Student("Seventh student", 3, "seventh@mail.com", "6542", "IT", "SU");
        student2.getStudentInfo();

        student3 = new Student("Fifth student", 1, "fifth@mail.com", "12345678");
        student3.getStudentInfo();

        System.out.println("Number of objects: " + Student.studentsCount);
    }

    public void getProperties() {
        Student student7 = new Student("John Dow", 3, "john@mail.com", "15973", "IT", "VTU");
        System.out.println("Name " + student7.getFullName());

        student7.setFullName("Changed name");
        System.out.println("Name " + student7.getFullName());
        System.out.println("Number of objects: " + Student.studentsCount);
    }
}
