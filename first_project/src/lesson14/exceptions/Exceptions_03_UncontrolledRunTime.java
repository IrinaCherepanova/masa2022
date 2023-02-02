package lesson14.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_03_UncontrolledRunTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = null;
        int age = 0;
        try {
        System.out.println("Enter your age:");
        age = input.nextInt();
        }
        catch (InputMismatchException exception){
            System.out.println("exception.getMessage() = " + exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println(name.length());
        System.out.println("age = " + age);


    }
}
