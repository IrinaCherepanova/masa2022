package lesson7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AreArraysEqual {
    public static void main(String[] args) {

        Integer[] myArray1 = {1, 2, 3, 4, 5};
        Integer[] myArray2 = {1, 2, 3};
        Integer[] myArray3 = {1, 2, 3, 4, 5};
        Integer[] myArray4 = {0, 1, 2, 3, 4};

        System.out.println("areArraysEqualWithMyWay(myArray1, myArray2) = " + areArraysEqualWithMyWay(myArray1, myArray2));
        System.out.println("areArraysEqualWithMyWay(myArray1, myArray3) = " + areArraysEqualWithMyWay(myArray1, myArray3));
        System.out.println("areArraysEqualWithMyWay(myArray1, myArray4) = " + areArraysEqualWithMyWay(myArray1, myArray4));

        System.out.println("--------------");

        System.out.println("areArraysEqualWithArrays(myArray1, myArray2) = " + areArraysEqualWithArrays(myArray1, myArray2));
        System.out.println("areArraysEqualWithArrays(myArray1, myArray3) = " + areArraysEqualWithArrays(myArray1, myArray3));
        System.out.println("areArraysEqualWithArrays(myArray1, myArray4) = " + areArraysEqualWithArrays(myArray1, myArray4));

        System.out.println("--------------");

        System.out.println("areArraysEqualWithStream(myArray1, myArray2) = " + areArraysEqualWithStream(myArray1, myArray2));
        System.out.println("areArraysEqualWithStream(myArray1, myArray3) = " + areArraysEqualWithStream(myArray1, myArray3));
        System.out.println("areArraysEqualWithStream(myArray1, myArray4) = " + areArraysEqualWithStream(myArray1, myArray4));
    }

    public static boolean areArraysEqualWithMyWay(Integer[] array1, Integer[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean areArraysEqualWithArrays(Integer[] array1, Integer[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean areArraysEqualWithStream(Integer[] array1, Integer[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        return IntStream.range(0, array1.length).noneMatch(i -> array1[i] != array2[i]);
    }

}