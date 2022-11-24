import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, n;
        while (true) {
            System.out.print("Введите x: ");
            try {
                x = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Что-то не так. Попробуйте снова.");
            }
        }
        while (true) {
            System.out.print("Введите n: ");
            try {
                n = Integer.parseInt(sc.next());
                if (n < 15 & n > -15)
                    break;
                else System.out.println("Что-то не так. Попробуйте снова.");
            } catch (NumberFormatException e) {
                System.out.println("Что-то не так. Попробуйте снова.");
            }
        }
        if ((int) n >= 0) {
            float a = 1;
            for (int b = 1; b <= n; b++) {
                a = a * x;
            }
            System.out.println("Результат: " + a);
        } else {
            n = -n;
            float a = 1;
            for (int b = 1; b <= n; b++) {
                a = a * x;
            }
            float d = (float) 1/a;
            System.out.println("Результат: " + d);
        }
    }
}
