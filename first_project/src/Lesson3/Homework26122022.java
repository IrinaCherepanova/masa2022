package Lesson3;

public class Homework26122022 {
    public static void main(String[] args) {

        int i1=5;
        int i2=11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result=0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("result = " + result);

        int a = 5;
        int aResult;
        aResult = a-- - --a + ++a + a++ + a;
        System.out.println("aResult = " + aResult);

        int b = 8;
        int bResult;
        bResult = ++b - b++ + ++b - --b;
        System.out.println("bResult = " + bResult);

        int x = 10;
        int y = 12;
        int z = 3;
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println("x = " + x + "; y = " + y + "; z = " + y);


    }
}
