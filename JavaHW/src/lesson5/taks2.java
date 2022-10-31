//Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
package lesson5;


import java.util.Collections;
import java.util.HashMap;

public class taks2 {

    public static HashMap<String, Integer> CountNames(String[] arr) {
        HashMap<String, String> persons = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();
        int count = 1;
        for (String str : arr) {
            var tmp = str.split(" ");
            persons.put(tmp[1], tmp[0]);
            if (persons.values().contains(tmp[0])) {
                result.put(tmp[0], Collections.frequency(persons.values(), tmp[0]));
            }
        }
        return result;
    }
}
