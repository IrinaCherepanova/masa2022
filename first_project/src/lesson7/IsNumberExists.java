package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IsNumberExists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[]{1, 2, 3, 4, 5};

        System.out.println("Please enter number:");
        int myNumber = input.nextInt();

        System.out.println("checkNumberInArray(myNumber, myArray) = " + checkNumberInArray(myNumber, myArray));
        System.out.println("checkNumberInArrayByStream(myNumber, myArray) = " + checkNumberInArrayByStream(myNumber, myArray));
        System.out.println("checkNumberInArrayByList(myNumber, myArray) = " + checkNumberInArrayByList(myNumber, myArray));
    }

    public static boolean checkNumberInArray(int myValue, int[] array){

        for (int element: array) {
            if (myValue == element){
                return true;
            }
        }

        return false;

    }

    public static boolean checkNumberInArrayByStream(int myValue, int[] array){
        int findedValue = IntStream.range(0, array.length).filter(i -> myValue == array[i]).findFirst().orElse(-1);
        return findedValue!=-1? true: false;
    }

    public static boolean checkNumberInArrayByList(int myValue, int[] array){
        return Arrays.asList(array).indexOf(myValue)==-1;
    }
}
