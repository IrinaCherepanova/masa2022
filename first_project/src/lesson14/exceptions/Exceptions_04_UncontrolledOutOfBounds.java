package lesson14.exceptions;

public class Exceptions_04_UncontrolledOutOfBounds {
    public static void main(String[] args) {

        int[] array = new int[5];
        System.out.println("Staring program...");
        array[56] = 56;
        System.out.println("Finishing program...");
    }
}
