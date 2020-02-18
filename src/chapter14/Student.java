package chapter14;

public class Student {

    static int studentsCount = 0;

    private String fullName = null;
    private int course = 0;
    private String email = null;
    private String phoneNumber = null;
    private Spec specialization;
    private Uni university;

    public enum Spec {
        IT,
        FINANCE,
        AUTO,
        MATH
    }

    public enum Uni {
        SU,
        TU,
        VTU
    }

    public Student() {
        this(null);
    }

    public Student(String fullName) {
        this(fullName, 0);
    }

    public Student(String fullName, int course) {
        this(fullName, course, null);
    }

    public Student(String fullName, int course, String email) {
        this(fullName, course, email, null);
    }

    public Student(String fullName, int course, String email, String phoneNumber) {
        this(fullName, course, email, phoneNumber, null);
    }

    public Student(String fullName, int course, String email, String phoneNumber, Spec specialization) {
        this(fullName, course, email, phoneNumber, specialization,null);
    }

    public Student(String fullName, int course, String email, String phoneNumber, Spec specialization, Uni university) {
        this.fullName = fullName;
        this.course = course;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.specialization = specialization;
        this.university = university;
        studentsCount++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpecialization() {
        return this.specialization.toString();
    }

    public void setSpecialization(Spec specialization) {
        this.specialization = specialization;
    }

    public String getUniversity() {
        return this.university.toString();
    }

    public void setUniversity(Uni university) {
        this.university = university;
    }

    public void getStudentInfo() {
        System.out.printf("Student name %s%n course %d%n specialization %s%n university %s%n email address - %s%n phone number %s.%n",
                fullName, course, specialization, university, email, phoneNumber);
    }

}
