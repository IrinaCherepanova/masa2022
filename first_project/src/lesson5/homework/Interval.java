package lesson5.homework;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        String interval = "";

        do{
            System.out.println("Please enter a number from 0 to 100:");
            number = input.nextInt();
            if (number<0 || number > 100){
                System.out.println("Wrong number!");
            }
        }
        while (number<0 || number > 100);

        if (number>=0 && number<=14){
            interval = "[0 - 14]";
        }
        else if (number>=15 && number<=35){
            interval = "[15 - 35]";
        }
        else if (number>=36 && number<=50){
            interval = "[36 - 50]";
        }
        else if (number>=50 && number<=100){
            interval = "[50 - 100]";
        }

        System.out.println(number + " is in the interval " + interval);
        input.close();
    }
}
