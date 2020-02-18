package chapter14;

import java.util.ArrayList;

public class SchoolClass {

    private ArrayList<SchoolTeacher> schoolTeachers;
    private String classId;

    public SchoolClass(ArrayList<SchoolTeacher> schoolTeachers, String classId) {
        this.schoolTeachers = schoolTeachers;
        this.classId = classId;
    }

    public String printInfo(String className) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (SchoolTeacher teacher : schoolTeachers) {
            stringBuilder.append(teacher.getName());
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        System.out.printf("Class %s with class ID %s has %s teachers.%n",
                className, classId, stringBuilder);
        return stringBuilder.toString();
    }
}
