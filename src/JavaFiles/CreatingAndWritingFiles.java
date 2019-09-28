package JavaFiles;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;


public class CreatingAndWritingFiles {
    public static void main(String[] args) {
        try {
            String url = "./src/JavaFiles/text";

            Formatter formatter = new Formatter(url);
            formatter.format("%s",
                    "I am a new file created with formatter class in io\nI am a good boy");
            formatter.close();

            File file = new File(url);

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
