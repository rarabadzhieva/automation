package chapter10.examples;

import chapter10.Cat;
import chapter10.Sequence;

public class Example4 {

    private Cat[] cats = new Cat[10];

    public Example4() {
        int i = Sequence.nextValue();
        while (i < 10) {
            cats[i] = new Cat("Cat" + (i+1), "");
            i = Sequence.nextValue();
        }
    }

    public void sayMiauCat() {
        for (Cat cat : cats) {
            cat.sayMiau();
        }
    }
}
