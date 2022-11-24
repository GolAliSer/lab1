import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day, month;
        while (true) {
            System.out.print("Введите день: ");
            try {
                day = Integer.parseInt(sc.next());
                if (day < 32 & day > 0)
                    break;
                else System.out.println("Что-то не так. Попробуйте снова.");
            } catch (NumberFormatException e) {
                System.out.println("Что-то не так. Попробуйте снова.");
            }
        }
        while (true) {
            System.out.print("Введите номер месяца: ");
            try {
                month = Integer.parseInt(sc.next());
                if (month < 13 & month > 0)
                    break;
                else System.out.println("Что-то не так. Попробуйте снова.");
            } catch (NumberFormatException e) {
                System.out.println("Что-то не так. Попробуйте снова.");
            }
        }
        String monthString;
        switch (month) {
            case 1, 2, 12: monthString = "Зима";
                break;
            case 3, 4, 5: monthString = "Весна";
                break;
            case 6, 7, 8: monthString = "Лето";
                break;
            case 9, 10, 11: monthString = "Осень";
                break;
            default: monthString = "Ошибка";
                break;
        }
        System.out.print(monthString);
    }
}