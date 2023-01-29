package lesson13.animals;

import lesson13.animals.interfaces.Runnable;

public class Dog extends Animal implements Runnable {

    @Override
    public void howManyLegs() {
        System.out.println("I'm a dog - I have 4 legs");
    }

    @Override
    public void breathe(int amountOfOxygen) {
        System.out.println("I'm a dog, I breath " + amountOfOxygen);
    }

    @Override
    public void run() {
        System.out.println("running");
    }
}
