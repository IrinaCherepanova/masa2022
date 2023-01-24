package lesson12.polymorphizm;

import java.util.ArrayList;

public class MyAnimals {

    public static void main(String[] args) {

        Iguana iguana = new Iguana();
        Lizards lizardsIguana = new Iguana();
        Animal animalIguana = new Iguana();

        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(iguana);
        animals.add(lizardsIguana);
        animals.add(animalIguana);

        animals.forEach(animal -> animal.hello());

    }
}
