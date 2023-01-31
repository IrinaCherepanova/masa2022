package lesson11.shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Messages {

    public static void printMainMenu(){
        System.out.println("\nPlease choose from the next Menu");
        System.out.println("1. Add new shape");
        System.out.println("2. List all shapes");
        System.out.println("3. Sum all perimeter");
        System.out.println("4. Sum all areas");
        System.out.println("5. Find the biggest perimeter");
        System.out.println("6. Find the biggest area");
        System.out.println("7. Exit");
    }

    public static int getMainMenuSelection()
    {
        int option = 0;
        do {
            Scanner input = new Scanner(System.in);
            printMainMenu();
            option = input.nextInt();
            if (option<1 || option>7) {
                System.out.println("Wrong choice! Please try again.");
            }
            else {
                System.out.println("You have chosen " + option);
            }
        }
        while (option<1 || option>7);
        return option;
    }


    public static void printShapesMenu() {
        System.out.println("\nPlease choose from the next Shapes:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Right triangle");
    }

    public static int getShapesMenuSelection(){
        int option = 0;
        do {
            Scanner input = new Scanner(System.in);
            printShapesMenu();
            option = input.nextInt();
            if (option<1 || option>4) {
                System.out.println("Wrong choice! Please try again.");
            }
            else {
                System.out.println("You have chosen " + option);
            }
        }
        while (option<1 || option>4);
        return option;
    }

    public static void printCollection(ArrayList<Shape> list){
        if (list.size() == 0) {
            System.out.println("There are no shapes in list");
            return;
        }
        list.forEach(shape -> System.out.println(shape));
    }

    public static void printSumAllPerimeters(ArrayList<Shape> collectionOfShapes){
        if (collectionOfShapes.size() == 0){
            System.out.println("There are no shapes in the list");
            return;
        }
        double sum = 0;
        for (Shape shape: collectionOfShapes) {
            sum += shape.calculatePerimeter();
        }
        System.out.println("Sum all perimeters = " + sum);
    }

    public static void printSumAllAreas(ArrayList<Shape> collectionOfShapes){
        if (collectionOfShapes.size() == 0){
            System.out.println("There are no shapes in the list");
            return;
        }
        double sum = 0;
        for (Shape shape: collectionOfShapes) {
            sum += shape.calculateArea();
        }
        System.out.println("Sum all areas = " + sum);
    }

    public static void printTheBiggestPerimeter(ArrayList<Shape> collectionOfShapes){
        if (collectionOfShapes.size() == 0){
            System.out.println("There are no shapes in the list");
            return;
        }
        double maxPerimeter = Double.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < collectionOfShapes.size(); i++) {
            double perimeterOfShape = collectionOfShapes.get(i).calculatePerimeter();
            if (maxPerimeter < perimeterOfShape){
                maxPerimeter = perimeterOfShape;
                maxIndex = i;
            }
        }
        System.out.println(collectionOfShapes.get(maxIndex).toString() + "\nThe perimeter of this shape is " + maxPerimeter);
    }

    public static void printTheBiggestArea(ArrayList<Shape> collectionOfShapes){
        if (collectionOfShapes.size() == 0){
            System.out.println("There are no shapes in the list");
            return;
        }
        double maxArea = Double.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < collectionOfShapes.size(); i++) {
            double areaOfShape = collectionOfShapes.get(i).calculateArea();
            if (maxArea < areaOfShape){
                maxArea = areaOfShape;
                maxIndex = i;
            }
        }
        System.out.println(collectionOfShapes.get(maxIndex).toString() + "\nThe area of this shape is " + maxArea);
    }
}
