package Lesson3;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 20;
        int b = 7;

        double c = 20;
        double d = 7;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("c + d = " + (c / d));
        System.out.println("c % d = " + (c % d));

        int resultOfInt = a * b;
        //int resultOfIntDouble = a * c;
        double resultOfIntDouble = a / d;
        System.out.println("resultOfIntDouble = " + resultOfIntDouble);

        System.out.println("a / 0 = "+ (c/0));

    }
}
