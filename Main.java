import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        out.println("Введите диаметр шарика: ");
        int x = in.nextInt();
        out.println("Введите диаметры отверстий: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        out.println("Шарик может пройти через ");
        if (x <= a) {
            if (x <= b) {
                if (x <= c) {
                    if (x <= d)
                        out.print(4 + " отверстия");
                    else
                        out.print(3 + " отверстия");
                }
                else
                    out.print(2 + " отверстия");
            }
            else
                out.print(1 + " отверстие");
        }
        else out.print(0 + " отверстий");

    }
}
