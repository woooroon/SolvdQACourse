package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_notFound {
    public void fileNotFound() {
        try {

            // Following file does not exist
            File file = new File("C://mobile_app_of_hospital.java");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
