package lesson6.collections;

import java.util.ArrayList;

public class Collection_01_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(5);
        myArrayList.add(7);
        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println(myArrayList.indexOf(5));
        System.out.println(myArrayList.indexOf(7));
        System.out.println(myArrayList.indexOf(8));
    }
}
