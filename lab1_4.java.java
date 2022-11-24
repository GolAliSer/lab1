import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N, R;
        System.out.print("Введите R: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не целове число. Попробуйте снова: ");
            sc.next();
        }
        R = sc.nextInt();
        System.out.print("Введите N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не целове число. Попробуйте снова: ");
            sc.next();
        }
        N = sc.nextInt();
        if (N < 0) {
            System.out.print("Точек нет.");
        }
        int schet = 0;
        while (N != 0) {
            System.out.print("Введите координату X: ");
            while (!sc.hasNextInt()) {
                System.out.print("Это не целове число. Попробуйте снова: ");
                sc.next();
            }
            int X = sc.nextInt();
            System.out.print("Введите координату Y: ");
            while (!sc.hasNextInt()) {
                System.out.print("Это не целове число. Попробуйте снова: ");
                sc.next();
            }
            int Y = sc.nextInt();
            if ((X * X) + (Y * Y) <= (R * R)) {
                schet = schet + 1;
            } else {
                schet = schet;
            }
            N = N - 1;
        }
        System.out.print(schet + " точек попали в окружность.");
    }
}