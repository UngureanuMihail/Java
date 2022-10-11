package homework_1;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void moveTail(int[] numsList) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner

        System.out.println("Введите число для перемещения в конец списка: ");
        int choice = input.nextInt(); // Читаем с клавиатуры число


        //индекс следующей доступной позиции
        int k = 0;

        for (int i : numsList) {
            // если текущий элемент отличен от выбранного числа, поместить элемент в
            // след. свободную позицию в массиве
            if (i != choice) {
                numsList[k++] = i;
            }
        }

        // перемещаем выбранное число в конец массива
        for (int i = k; i < numsList.length; i++) {
            numsList[i] = choice;
        }
    }
}

