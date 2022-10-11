/* Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
оно должно записаться в лог-файл. (используйте метод list класса File) */
package homework_2;

import java.io.File;
import java.io.IOException;

public class task1 {
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
}




