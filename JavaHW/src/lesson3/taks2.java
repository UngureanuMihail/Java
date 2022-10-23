package lesson3;
import java.util.*;

public class taks2 {
    static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 13);



    public static void math() {
        Integer max = Collections.max(list);
        System.out.println("Максимальное число: " + max);
        Integer min = Collections.min(list);
        System.out.println("Минимальное число: " + min);
    }

    public static void average (){
        double avName = 0;
        if (list.size() > 0){
            for (int i = 0; i <list.size() ; i++) {
                avName += list.get(i);}
        }
        System.out.println(avName / list.size());
    }
}