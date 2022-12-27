package Lesson4;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "P@ssword";
        String getUsername;
        String getPassword;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter username");
        getUsername = input.nextLine();

        if (getUsername.equals(username)){
            System.out.println("Please enter password");
            getPassword = input.nextLine();
            if (getPassword.equals(password)){
                System.out.println("Hello, " + username + ", you are logged in.");
            }
            else {
                System.out.println("Wrong password!");
            }
        }
        else {
            System.out.println("There is no username " + getUsername);
        }


    }
}
