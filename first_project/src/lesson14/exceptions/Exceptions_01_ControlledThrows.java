package lesson14.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions_01_ControlledThrows {

    public static void main(String[] args) throws IOException {

        File ourFile = new File("D://file.txt");
        FileReader reader = new FileReader(ourFile);
        reader.close();
    }
}
