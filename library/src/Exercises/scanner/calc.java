package Exercises.scanner;


import java.util.Scanner;

public class calc {

    public static void main(String[] args) {

        obliczenia calculate = new obliczenia();


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double a = scan.nextDouble();
        scan.nextLine();
        System.out.println("co chcesz zrobić 15.5? : +,-,/,*");
        String s = scan.nextLine();
        System.out.println("Podaj drugą liczbę");
        double b = scan.nextDouble();

        Double result=calculate.calculate(a,b,s);
        System.out.println("Wynik wynosi "+result);





    }

}
