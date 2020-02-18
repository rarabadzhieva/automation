package chapter20;

public abstract class Animal {

    int age;
    String name;
    String gender;

    public Animal(String name, String gender, int age) {
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public abstract String makeSound();

    public String animalInfo() {
        return "Name: " + name + "; gender: " + gender + "; age: " + age;
    }
}
