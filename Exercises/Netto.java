package Exercises;

import java.util.Random;

public class Netto {

    public static void main(String[] args) {

        double cenaNetto = 100.00;
        double vat = 0.23;
        Random rand = new Random();

        double zmienna = rand.nextInt(100);

        System.out.println("cena produktu netto wynosi = "+zmienna);
        System.out.println("cena brutto = "+(zmienna+zmienna*vat));
        System.out.println("vat = "+ vat);

    }
}
