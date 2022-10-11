package homework_2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File directory = new File("/Users/mihailungureanu/Desktop/Test");
        task1.WriteInFile(task1.getDirectory(directory) , "directories.txt");
    }
}
