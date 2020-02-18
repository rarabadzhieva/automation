package chapter10.examples;

import java.util.Random;

public class Example5 {

    private static final String[] PHRASE = {"Продуктът е отличен.", "Това е страхотен продукт.",
            "Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория."};

    private static final String[] EVENT = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
            "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};

    private static final String[] FIRST_NAME = {"Диана", "Петя", "Стела", "Елена", "Катя"};

    private static final String[] LAST_NAME = {"Иванова", "Петрова", "Кирова"};

    private static final String[] CITY = {"София", "Пловдив", "Варна", "Русе", "Бургас"};

    public void getAd() {
        System.out.printf("%s %s - %s %s, %s%n", chooseItem(PHRASE), chooseItem(EVENT), chooseItem(FIRST_NAME),
                chooseItem(LAST_NAME), chooseItem(CITY));
    }

    private String chooseItem(String[] items) {
        Random random = new Random();
        int pos = random.nextInt(items.length);
        return items[pos];
    }
}
