package chapter10.examples;

import chapter10.Cat;
import chapter10.Sequence;

public class Example3 {

    public Example3(String catName, String catColor) {
        Cat myCat = new Cat(catName, catColor);
        myCat.sayMiau();

        int value = Sequence.nextValue();
        System.out.println("Next value is: " + value);
    }
}
