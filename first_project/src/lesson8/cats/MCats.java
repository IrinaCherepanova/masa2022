package lesson8.cats;

import java.util.ArrayList;

public class MCats {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Bulochka", "Grey", 3));
        cats.add(new Cat("Pirozhok", "White", 2));
        cats.add(new Cat("Bublic", "Grey", 1));
        cats.add(new Cat("Ponchik", "Black", 3));
        cats.add(new Cat("Baranka", "White", 4));

        cats.forEach(cat -> System.out.println(cat.toString()));

    }
}
