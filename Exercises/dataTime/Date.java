package Exercises.dataTime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        try {
            LocalDate date1 = readDateFromUser();
            LocalDate date2 = readDateFromUser();
            showLaterdate(date1, date2);
            showPeriodBeetween(date1, date2);
        } catch (DateTimeException e) {
            System.out.println("Podano nieprawidłowa date");
        }
    }

    private static LocalDate readDateFromUser() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj dzień miesiąca");
//        int day = scanner.nextInt();
//        System.out.println("Podaj miesiąc");
//        int month = scanner.nextInt();
//        System.out.println("Podaj rok");
//        int year = scanner.nextInt();
//        return LocalDate.of(year, month, day);
        System.out.println("Podaj datę w formacie yyy-MM-dd");
        String dateInput = scanner.nextLine();
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateInput, datePattern);

    }


    private static void showPeriodBeetween(LocalDate date1, LocalDate date2) {
        Period between = Period.between(date1, date2);
        int days = Math.abs(between.getYears());
        int months = Math.abs(between.getMonths());
        int years = Math.abs(between.getYears());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni", years, months, days);

    }

    private static void showLaterdate(LocalDate date1, LocalDate date2) {

        if (date1.equals(date2)) {
            System.out.println("Obie daty są takie same");
        } else {
            boolean after = date1.isAfter(date2);
            LocalDate laterDate;
            if (after) {
                laterDate = date1;
            } else {
                laterDate = date2;
            }
            System.out.println("Póznijesza data to " + laterDate);

        }


    }
}
