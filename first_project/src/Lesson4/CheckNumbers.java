package Lesson4;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter number");
        number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("четное");
        }
        else{
            System.out.println("нечетное");
        }

    }
}
