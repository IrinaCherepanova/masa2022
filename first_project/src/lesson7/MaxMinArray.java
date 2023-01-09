package lesson7;

import java.util.Random;

public class MaxMinArray {
    public static void main(String[] args) {

        Random random = new Random();
        double[] newArray = new double[10];
        for (int i = 0; i < 10; i++) {
            newArray[i] = random.nextDouble();
            System.out.print(newArray[i] + " ");
        }


        System.out.println("\ngetMinValue(newArray) = " + getMinValue(newArray));
        System.out.println("getMaxValue(newArray) = " + getMaxValue(newArray));
        System.out.println("getAverageValue(newArray) = " + getAverageValue(newArray));

    }

    public static double getMinValue(double[] myArray){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i]){
                min = myArray[i];
            }
        }
        return min;
    }

    public static double getMaxValue(double[] myArray){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]){
                max = myArray[i];
            }
        }
        return max;
    }

    public static double getAverageValue(double[] myArray){
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
           sum += myArray[i];
        }
        return sum/myArray.length;
    }
}
