package chapter14;

import java.util.ArrayList;

public class SchoolTeacher {

    private ArrayList<SchoolDiscipline> disciplines;
    private String name;

    public SchoolTeacher(String name, ArrayList<SchoolDiscipline> disciplines) {
        this.name = name;
        this.disciplines = disciplines;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (SchoolDiscipline discipline : disciplines) {
            stringBuilder.append(discipline.getName());
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        System.out.printf("Teacher %s has %s disciplines.%n",
                name, stringBuilder);
    }
}
