package chapter14;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolTest {

    private SchoolStudent[] students = new SchoolStudent[4];
    private ArrayList<SchoolDiscipline> disciplines = new ArrayList<>();
    private ArrayList<SchoolTeacher> teachers = new ArrayList<>();
    private SchoolClass schoolClass;

    private void createStudents() {
        students[0] = new SchoolStudent("Ivan Ivanov", "II");
        students[1] = new SchoolStudent("Petar Ivanov", "PI");
        students[2] = new SchoolStudent("Dimitar Petrov", "DP");
        students[3] = new SchoolStudent("Petar Dimitrov", "PD");

//        for (SchoolStudent student : students) {
//            student.printInfo();
//        }
    }

    private void createDisciplines() {
        SchoolDiscipline[] disciplines = new SchoolDiscipline[5];
        disciplines[0] = new SchoolDiscipline("Math", 30, 2);
        disciplines[1] = new SchoolDiscipline("BG", 30, 2);
        disciplines[2] = new SchoolDiscipline("Bio", 20, 1);
        disciplines[3] = new SchoolDiscipline("Sport", 15, 1);
        disciplines[4] = new SchoolDiscipline("IT", 10, 3);

        for (SchoolDiscipline discipline : disciplines) {
            this.disciplines.add(discipline);
//            discipline.printInfo();
        }
//        this.disciplines.addAll(Arrays.asList(disciplines));
    }

    private void createTeachers() {
        SchoolTeacher[] teachers = new SchoolTeacher[2];
        teachers[0] = new SchoolTeacher("Teacher1" , disciplines);
        teachers[1] = new SchoolTeacher("Teacher2", disciplines);

//        teachers[0].printInfo();
//        teachers[1].printInfo();

        this.teachers.addAll(Arrays.asList(teachers));
    }

    private void createClass() {
        schoolClass = new SchoolClass(teachers, "mm");
//        schoolClass.printInfo("Math");
    }

    private void createSchool() {
        createStudents();
        createDisciplines();
        createTeachers();
        createClass();
    }

    public void testSchool() {
        createSchool();
        School school = new School(schoolClass, students[0]);
        school.printInfo();

    }
}
