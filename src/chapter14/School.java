package chapter14;

public class School {

    private SchoolClass schoolClass;
    private SchoolStudent student;

    public School(SchoolClass schoolClass, SchoolStudent student) {
        this.schoolClass = schoolClass;
        this.student = student;
    }

    public void printInfo() {
        System.out.printf("This school has student %s, and classes %s",
                student.printInfo(), schoolClass.printInfo("math"));
    }
}
