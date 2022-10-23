package lesson3;
import java.util.ArrayList;

public class task1 {

    static void Numbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println(numbers);
        for (int i = numbers.size() - 1; i >= 0; i--)
            if (numbers.get(i) % 2 == 0)
                numbers.remove(i);
        System.out.println(numbers);
    }
}
