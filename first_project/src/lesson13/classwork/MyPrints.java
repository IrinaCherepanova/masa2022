package lesson13.classwork;

import java.util.ArrayList;

public class MyPrints {

    public static void main(String[] args) {

        ArrayList <Print> prints = new ArrayList<>();

        prints.add(new Book(100));
        prints.add(new Book(200));
        prints.add(new Magazine(15));
        prints.add(new Magazine(30));

        prints.forEach(print -> print.printYouType());
        prints.forEach(print -> print.howManyPages(print.getPages()));

    }
}
