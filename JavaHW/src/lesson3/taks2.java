package lesson3;

import java.util.*;
import java.util.stream.IntStream;

public class taks2 {


    public static void Math() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer max = Collections.max(list);
        System.out.println("Максимальное число: " + max);
        Integer min = Collections.min(list);
        System.out.println("Минимальное число: " + min);
    }
}