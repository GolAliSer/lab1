import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day, month, year;
        while (true) {
            System.out.print("Введите день рождения: ");
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
            System.out.print("Введите месяц рождения: ");
            try {
                month = Integer.parseInt(sc.next());
                if (month < 13 & month > 0)
                    break;
                else System.out.println("Что-то не так. Попробуйте снова.");
            } catch (NumberFormatException e) {
                System.out.println("Что-то не так. Попробуйте снова.");
            }
        }
        while (true) {
            System.out.print("Введите год рождения: ");
            try {
                year = Integer.parseInt(sc.next());
                if (year < 2022 & year > 0)
                    break;
                else System.out.println("Что-то не так. Попробуйте снова.");
            } catch (NumberFormatException e) {
                System.out.println("Что-то не так. Попробуйте снова.");
            }
        }
        System.out.println("Введенная дата: " + day + "." + month + "." + year);

        int year1 = 2022;
        int month1 = 11;
        int day1 = 25;
        System.out.println("Текущая дата: " + day1 + "." + month1 + "." + year1);

        if (month > month1 & day > day1)
            System.out.println("лет: " + ((year1 - year) - 1) + " дней: " + (31 - (day - day1)) + " месяцев: " + (month1 - 1));
        else if (month > month1 & day <= day1)
            System.out.println("лет: " + ((year1 - year) - 1) + " дней: " + (day1 - day) + " месяцев: " + month1);
        else if (month <= month1 & day <= day1)
            System.out.println("лет: " + (year1 - year) + " дней: " + (day1 - day) + " месяцев: " + (month1 - month));
        else if (month <= month1 & day > day1)
            System.out.println("лет: " + (year1 - year) + " дней: " + (31 - (day - day1) + " месяцев: " + ((month1 - month) + 1)));
    }
}
