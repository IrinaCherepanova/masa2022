package lesson6.homework;

import java.util.Random;

public class CustomerArray {
    public static void main(String[] args) {
        Random random = new Random();
        double myArray[] = new double[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextDouble();
            System.out.println(myArray[i]);
        }

        System.out.println();

        double max = myArray[0];
        double min = myArray[0];
        double sum = 0;

        for (double element : myArray) {
            if (element > max){
                max = element;
            }
            if (element < min){
                min = element;
            }
            sum += element;
            if (element % 2 != 0){
                System.out.println("нечетное " +element);
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("average = " + sum/ myArray.length);


    }
}
