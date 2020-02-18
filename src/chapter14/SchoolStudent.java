package chapter14;

public class SchoolStudent {

    private String name = null;
    private String id = null;

    public SchoolStudent(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String printInfo() {
        System.out.printf("Student %s with id %s.%n",
                name, id);
        return name;
    }
}
