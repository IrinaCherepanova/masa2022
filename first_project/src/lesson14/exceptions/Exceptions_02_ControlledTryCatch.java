package lesson14.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions_02_ControlledTryCatch {

    public static void main(String[] args) {

        File ourFile = new File("D://file.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(ourFile);
        } catch (FileNotFoundException e) {
            System.out.println("Where is the file?");
        }

    }
}
