package lesson5;

import java.util.ArrayList;
import java.util.HashMap;

public class task5 {

    public static void PhoneBook(String[] arr) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> phones = new ArrayList<>();
        for (String str : arr) {
            var value = str.split("-");
            if (!phoneBook.containsKey(value[0])) {
                phones = new ArrayList<>();
                phones.add(value[1]);
                phoneBook.put(value[0], phones);

            } else if (phoneBook.containsKey(value[0])) {
                phones.add(value[1]);
            }
        }
        System.out.println(phoneBook);
    }
}
