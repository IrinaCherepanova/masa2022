package lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class IsNumberExists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[]{1, 2, 3, 4, 5};

        System.out.println("Please enter number:");
        int myNumber = input.nextInt();

        System.out.println("checkNumberInArray(myNumber, myArray) = " + checkNumberInArray(myNumber, myArray));
    }

    public static boolean checkNumberInArray(int myValue, int[] array){

        for (int element: array) {
            if (myValue == element){
                return true;
            }
        }

        return false;


    }
}
