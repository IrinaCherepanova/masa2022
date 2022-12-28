package lesson5;

import java.util.Scanner;

public class WorkersBonus {
    public static void main(String[] args) {

        double premium;
        Scanner input = new Scanner(System.in);

        System.out.println("PLese enter your salary:");
        double salary = input.nextDouble();

        System.out.println("Please enter your work experience:");
        double workExperience = input.nextDouble();

        if(workExperience < 5){
            premium = salary * 0.1;
        }
        else if (workExperience >= 5 && workExperience < 10){
            premium = salary * 0.15;
        }
        else if (workExperience >= 10 && workExperience < 15){
            premium = salary * 0.25;
        }
        else if (workExperience >= 15 && workExperience < 20){
            premium = salary * 0.35;
        }
        else if (workExperience >= 20 && workExperience < 25){
            premium = salary * 0.45;
        }
        else if (workExperience >= 25){
            premium = salary * 0.5;
        }
        else {
            System.out.println("Wrong work experience");
            return;
        }

        System.out.println("Bonus = "+premium);
        System.out.println("New salary = " + (salary+premium));

        input.close();
    }
}
