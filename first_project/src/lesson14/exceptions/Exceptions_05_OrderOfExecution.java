package lesson14.exceptions;

import java.util.Scanner;

public class Exceptions_05_OrderOfExecution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Your age:");
            int age = input.nextInt();
            System.out.println("age = " + age);
        }
        catch (Exception exception){
            System.out.println("!!");
            exception.printStackTrace();
        }
        finally {
            System.out.println("Good bye");
        }
    }
}
