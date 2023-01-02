package lesson6;

import java.util.Random;

public class MaxGrade {
    public static void main(String[] args) {

        Random random = new Random();

        int grades[] = new int[5];
        String names[] = {"Irina", "Roman", "Gleb", "Karina", "Olga"};

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(100);
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

        int maxGrade = grades[0];
        int index = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade){
                maxGrade = grades[i];
                index = i;
            }
        }

        System.out.println("The best student: " + names[index] + " grade:" + grades[index]);

    }
}
