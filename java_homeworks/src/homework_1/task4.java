package homework_1;
//Вычислить n-ое треугольное число


public class task4 {

    public static int triangle(int number) {
        if (number == 1) {
            return 1;
        }
        return (number * (number + 1)) / 2;
    }
}
