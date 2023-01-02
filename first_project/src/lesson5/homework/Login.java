package lesson5.homework;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String username = "username";
        String password = "password";
        String getUsername, getPassword, message;
        boolean login = false;
        Scanner input = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            System.out.println("Please enter username:");
            getUsername = input.nextLine();
            if (username.equals(getUsername)){
                for (int j = 5; j >= 1; j-- ) {
                    System.out.println("Please enter password:");
                    getPassword = input.nextLine();
                    if (password.equals(getPassword)) {
                        System.out.println("You are logged in!");
                    }
                    else {
                        message = (j!=1)?("Try again, "+ (j-1) + " attempts left"):"Bye!";
                        System.out.println("Wrong password! " + message);
                    }
                }
                return;
            }
            else {
                message = (i!=1)?("Try again, "+ (i-1) + " attempts left"):"Bye!";
                System.out.println("Wrong username! " + message);
            }
        }



    }
}
