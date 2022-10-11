/* Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
оно должно записаться в лог-файл. (используйте метод list класса File) */

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class task1 {
    //Метод для создания массива директории и файлов
    public static String[] getDirectory(File dir) {
        File[] files = dir.listFiles();
        String[] filesList = new String[files.length];

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile())
                filesList[i] = files[i].getName();
            else {
                filesList[i] = files[i].getName();
                getDirectory(files[i]);
            }
            System.out.println(files[i]);
        }
        return filesList;
    }

    // Метод для записи в документ информации возвращаемой методом getDirectory()
    public static void WriteInFile(String[] files, String name) throws IOException {
        File file = new File(name);
        FileWriter writer = new FileWriter(file);
        for (String items : files) {
            writer.write(items + "\n");
        }
        writer.close();
    }

    ///Метод для вывода на консоль расширения файлов
    public static void getExtension(String[] files) {
        String fileType = "";
        for (int i = 0; i < files.length; i++) {
            File file = new File(files[i]);
            if (getFileExtension(file).length() == 0) {
                System.out.println(files[i] + " - папка");
            } else {
                System.out.println("Расширение файла: " + getFileExtension(file));
            }
        }
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }
}
