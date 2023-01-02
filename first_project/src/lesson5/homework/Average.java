package lesson5.homework;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double getStartNumber, getEndNumber;
        Scanner input = new Scanner(System.in);
        boolean correctInterval = false;

        do {
            System.out.println("Please enter start number:");
            getStartNumber = input.nextDouble();
            System.out.println("Please enter end number:");
            getEndNumber = input.nextDouble();

            if (getEndNumber > getStartNumber) {
                correctInterval = true;
                double sum = 0;
                for (double i = getStartNumber; i <= getEndNumber ; i++) {
                    sum += i;
                }
                System.out.println("Average from "+ getStartNumber + " to " + getEndNumber + " = " + (sum/(getEndNumber-getStartNumber+1)));
            } else {
                System.out.println("Wrong interval! End number must be greater than Start number! Try again.");
            }
        }
        while (correctInterval != true);
    }
}
