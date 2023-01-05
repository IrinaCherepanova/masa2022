package lesson6.collections;

import java.util.HashMap;
import java.util.Map;

public class Collection_03_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1111, "Alex");
        hashMap.put(2222, "Irina");
        hashMap.put(3333, "Karina");
        hashMap.put(1111, "Shura");

        System.out.println(hashMap.get(1111));
        System.out.println(hashMap.get(11112));
        System.out.println(hashMap.containsKey(11112));
        System.out.println(hashMap.containsKey(1111));
        System.out.println(hashMap.containsValue("Irina"));
        System.out.println(hashMap.containsValue("Alex"));

        for (Map.Entry<Integer, String> pairOfValues: hashMap.entrySet()) {
            System.out.println(pairOfValues.getKey() + " - " + pairOfValues.getValue());
        }

        hashMap.forEach((id, name) -> System.out.println(id+ " - " + name));
    }
}
