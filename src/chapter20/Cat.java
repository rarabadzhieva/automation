package chapter20;

public class Cat extends Animal {

    public Cat(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public String makeSound() {
        return "Meow meow";
    }
}
