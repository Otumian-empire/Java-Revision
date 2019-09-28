package JavaFiles;

import java.io.File;

public class WorkingWithFiles {
    public static void main(String[] args) {
        File file = new File("hello.java");
        if (!file.exists()) {
            System.out.println(file.getName() + " does not exist");
        }
    }
}
