import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        // Считывание пяти целых чисел x, a, b, c, d из консоли
        out.println("Введите диаметр шарика: ");
        int x = in.nextInt();
        // Объявили минимум и максимум области значений
        int min = 0;
        int max = (int)Math.pow(10, 9);
        // Проверка, входит ли число в диапазон
        while (x <= min || x >= max ) {
            out.println("Число не входит в диапазон допустимых значений `0 < x < 10^9`, введите новое число:");
            x = in.nextInt();
        }
        out.println("Введите диаметры отверстий: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        // Проверка, входит ли последовательность в диапазон
        while (a <= min || a >= max || b <= min || b >= max || c <= min || c >= max || d <= min || d >= max) {
            out.println("В последовательности присутствует число, которое не входит в диапазон `0 < ваше число < 10^9`. " +
                    "Введите последовательность, в которой каждое число в ходит в диапазон допустимых значений:");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            }
        // определение через сколько отверстий пройдет шар
        // если диаметр шара меньше или равен диаметру отверстия, мы переходим к следующему отверстию
        // если диаметр шара больше диаметра отверстия, мы выводим, через сколько отверстий успел пройти шар
        if (x <= a) {
            if (x <= b) {
                if (x <= c) {
                    if (x <= d)
                        out.print(4);
                    else
                        out.print(3);
                }
                else
                    out.print(2);
            }
            else
                out.print(1);
        }
        else out.print(0);
    }
}
