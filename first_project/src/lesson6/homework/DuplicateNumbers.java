package lesson6.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        HashMap<Integer, Integer> collection = new HashMap<>();

        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(50);
            myArrayList.add(value);
            System.out.print(value + " ");
            if (collection.containsKey(value)){
                collection.put(value, collection.get(value)+1);
            }
            else {
                collection.put(value, 1);
            }
        }

        System.out.println("\nCollection:");
        collection.forEach((number, amount) -> System.out.println(number + " - " + amount));

    }
}
