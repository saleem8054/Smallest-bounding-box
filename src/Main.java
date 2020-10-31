import java.io.FileNotFoundException;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        try {
            database.read("file.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.exit(-1);
        } catch (InvalidInputException ex) {
            System.out.println("Invalid input!");
            System.exit(-1);
        }

        database.report();
    }
}
