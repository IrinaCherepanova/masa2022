package Lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Ввести первое число: ");
        firstNumber = input.nextDouble();
        System.out.println("Ввести второе число: ");
        secondNumber = input.nextDouble();

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));




    }
}
