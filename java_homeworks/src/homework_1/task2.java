package homework_1;
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1

import java.util.Scanner;

public class task2 {

    public static void repeatCheck() {
        Scanner input = new Scanner(System.in); // Объявляем Scanner

        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива

        System.out.println("Введите число для проверки повторений:");
        int countNumber = input.nextInt(); // Читаем с клавиатуры число для проверку на количество повторений

        int[] numsList = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы:");

        //Заполнение массива
        for (int i = 0; i < size; i++) {
            numsList[i] = input.nextInt();
        }

        int max_repeat = 0; // Маскимальное количество повторений
        int current_repeat = 0;// Текущее количество повторений
        //
        for (int i = 0; i < numsList.length; i++) {
            if (numsList[i] == countNumber) {
                current_repeat++;
            } else {
                if (max_repeat < current_repeat) {
                    max_repeat = current_repeat;
                }
                current_repeat = 0;
            }
        }
        if (max_repeat < current_repeat) {
            max_repeat = current_repeat;
        }

        System.out.println("Ваше число " + countNumber + " повторяется максимальное количество раз - " + max_repeat);

    }
}
