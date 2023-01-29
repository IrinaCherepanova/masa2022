package lesson13.animals;

import lesson13.animals.interfaces.Breathable;

public class Snake extends Animal implements Breathable {


    @Override
    public void howManyLegs() {
        System.out.println("I'm a snake - I have no legs");
    }

    @Override
    public void breathe(int amountOfOxygen) {
        System.out.println("I'm a snake. I breathe " + amountOfOxygen);
    }
}
