package lesson6.collections;

import java.util.HashMap;

public class Collection_03_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1111, "Alex");
        hashMap.put(2222, "Irina");
        hashMap.put(3333, "Karina");
        hashMap.put(1111, "Shura");

        System.out.println(hashMap);
    }
}
