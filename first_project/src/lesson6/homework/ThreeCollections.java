package lesson6.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ThreeCollections {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> myNumbers = new ArrayList<>();
        ArrayList<String> myNames = new ArrayList<>();
        ArrayList<String> myNumbersWithNames = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myNumbers.add(random.nextInt(50));
            myNames.add("Name"+i);
            myNumbersWithNames.add(myNumbers.get(i) + " - " + myNames.get(i));
        }

        myNumbersWithNames.forEach(element -> System.out.println(element));

    }

}
