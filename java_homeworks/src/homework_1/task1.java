/*В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59 • "Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59; • "Доброй ночи, <Имя>!", если время от 23:00 до 4:59*/

package homework_1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task1 {

    public static void Greetings() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine(); //Запрос ввода у пользователя имени

        Calendar calendar = GregorianCalendar.getInstance(); //Создание календаря
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // получение времени в формате 24 часа

        //Обработка времени в зависимости от задачи
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро , " + name + "!");
        }
        if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день , " + name + "!");
        }
        if (hour > 18 && hour < 22) {
            System.out.println("Добрый вечер , " + name + "!");
        } else {
            System.out.println("Доброй ночи , " + name + "!");
        }
    }
}
