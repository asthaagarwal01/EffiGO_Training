import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Read {
    public static void main(String[] args) {
        
        Path file = Paths.get("C:/Users/Astha/Documents/Sample.txt");

        try {
            // Read all the conten of file
            List<String> lines = Files.readAllLines(file);

            // Displaying the content of the file
            System.out.println("File Contents:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error occurred : " + e.getMessage());
        }
    }
}
