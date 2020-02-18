package chapter20;

public class Frog extends Animal {

    public Frog(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public String makeSound() {
        return "Croak croak";
    }
}
