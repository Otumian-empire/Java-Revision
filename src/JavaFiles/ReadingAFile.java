package JavaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class ReadingAFile {
    public static void main(String[] args) {
        // reading from a file can be done simply using the Scanner class
        try {
            // File file = new File("./src/JavaFiles/hello");
            URL url = ReadingAFile.class.getResource("hello");
            File file = new File(url.toURI());

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }

            scanner.close();
        } catch (FileNotFoundException | URISyntaxException e) {
            System.out.println(e.getMessage());
        }


    }
}
