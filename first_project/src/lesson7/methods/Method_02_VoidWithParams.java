package lesson7.methods;

import java.util.ArrayList;

public class Method_02_VoidWithParams {
    public static void main(String[] args) {

        sayHello("Irina", 32);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        printArrayList(arrayList);
    }

    public static void sayHello(String name, int age){
        System.out.println("Hello " + name + "!");
        System.out.println("You're " + age);
    }

    public static void printArrayList(ArrayList<Integer> list){
        System.out.println("list.size() = " + list.size());
        System.out.println();
        list.forEach((number) -> System.out.print(number+ " "));
        System.out.println();
    }
}
