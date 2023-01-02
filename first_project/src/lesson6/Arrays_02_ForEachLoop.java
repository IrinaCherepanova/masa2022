package lesson6;

public class Arrays_02_ForEachLoop {
    public static void main(String[] args) {

        int arrayOfNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i] + " ");

        }

        for (int number : arrayOfNumbers){
            System.out.println(number + " ");
        }

        int array[] = new int[10];
        for (int number : arrayOfNumbers) {
            System.out.println(number + " ");
        }
    }
}
