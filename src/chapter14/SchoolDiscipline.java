package chapter14;

public class SchoolDiscipline {

    private String name = null;
    private int lesson = 0;
    private int hours = 0;

    public SchoolDiscipline(String name, int lesson, int hours) {
        this.name = name;
        this.lesson = lesson;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.printf("Discipline %s has %d lessons which is %d hours.%n",
                name, lesson, hours);
    }
}
