package lesson6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValues {
    public static void main(String[] args) {

        Random random = new Random();
        ThreadLocalRandom treadLocalRandom = ThreadLocalRandom.current();

//        int randomInteger = random.nextInt();
//        int randomIntegerWithBound = random.nextInt(10);
//        double randomDouble = random.nextDouble();

//        System.out.println("randomInteger = " + randomInteger);
//        System.out.println("randomIntegerWithBound = " + randomIntegerWithBound);
//        System.out.println("randomDouble = " + randomDouble);

        int randomIntegerWithBounds = treadLocalRandom.nextInt(10, 20);
        System.out.println("randomIntegerWithBounds = " + randomIntegerWithBounds);



    }
}
