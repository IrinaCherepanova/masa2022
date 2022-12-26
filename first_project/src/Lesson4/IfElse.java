package Lesson4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter your age...");

        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are adult");
        }
        else {
            System.out.println("You are young");
        }

    }
}
