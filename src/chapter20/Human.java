package chapter20;

public class Human {

    private String firstName;
    private String familyName;

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Human() {
        this("John", "Doe");
    }

    public Human(String firstName, String familyName) {
        this.firstName=firstName;
        this.familyName=familyName;
    }
}
