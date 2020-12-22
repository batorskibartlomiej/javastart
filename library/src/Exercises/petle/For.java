package Exercises.petle;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        int i = 0;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("podaj ilośc liczb");
        int liczba = scanner.nextInt();


        while ( liczba-->0) {
            System.out.println("Podaj liczbę");

            suma = suma + scanner.nextInt();



        }
        System.out.println("suma wynosi "+suma);
    }

}