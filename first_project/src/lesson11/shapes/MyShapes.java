package lesson11.shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShapes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Shape> collectionOfShapes = new ArrayList<>();
        int mainMenuOption = 0;
        int shapesMenuOption = 0;

        do{
            mainMenuOption = Messages.getMainMenuSelection();
            switch (mainMenuOption){
                case 1:
                    shapesMenuOption = Messages.getShapesMenuSelection();
                    switch (shapesMenuOption){
                        case 1:
                            collectionOfShapes.add(new Square());
                            break;
                        case 2:
                            collectionOfShapes.add(new Rectangle());
                            break;
                        case 3:
                            collectionOfShapes.add(new Circle());
                            break;
                        case 4:
                            collectionOfShapes.add(new RightTriangle());
                            break;
                    }
                    break;
                case 2:
                    Messages.printCollection(collectionOfShapes);
                    break;
                case 3:
                    Messages.printSumAllPerimeters(collectionOfShapes);
                    break;
                case 4:
                    Messages.printSumAllAreas(collectionOfShapes);
                    break;
                case 5:
                    Messages.printTheBiggestPerimeter(collectionOfShapes);
                    break;
                case 6:
                    Messages.printTheBiggestArea(collectionOfShapes);
                    break;
            }

        }while (mainMenuOption != 7);

        System.out.println("Bye!");

    }
}

