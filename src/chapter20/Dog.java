package chapter20;

public class Dog extends Animal {

    public Dog(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public String makeSound() {
        return "Woof woof";
    }
}
