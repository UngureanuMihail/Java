import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //Путь к директории для теста
        File directory = new File("/Users/mihailungureanu/Desktop/Test");



        var dir = task1.getDirectory(directory);

        //Работа с логгером
        Logger logger = Logger.getLogger(task1.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(ch);
        logger.addHandler(fh);

        try {
            task1.WriteInFile(dir, "содержимое папки.txt");
            logger.log(Level.INFO, "Работа завершена без ошибок");
            logger.info("Код успешно выполнился");
        } catch (IOException e) {
            logger.log(Level.WARNING, e.toString());
            logger.info(e.toString());
        }
    }
}