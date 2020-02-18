package chapter14;

import java.util.Comparator;

public class Student {

    public static int studentsCount = 0;

    private String fullName = null;
    private int course = 0;
    private String email = null;
    private String phoneNumber = null;
    private String specialization = null;
    private String university = null;

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

    public Student(String fullName, int course, String email, String phoneNumber, String specialization) {
        this(fullName, course, email, phoneNumber, specialization,null);
    }

    public Student(String fullName, int course, String email, String phoneNumber, String specialization, String university) {
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
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void getStudentInfo() {
        System.out.printf("chapter14.Student name %s%n course %d%n specialization %s%n university %s%n email address - %s%n phone number %s.%n",
                fullName, course, specialization, university, email, phoneNumber);
    }
}
