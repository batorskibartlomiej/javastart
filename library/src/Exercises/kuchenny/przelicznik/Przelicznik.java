package Exercises.kuchenny.przelicznik;

public class Przelicznik {

    private static double SZKLANKA = 250;
    private static double ŁYŻKA = 15;
    private static double ŁYŻECZKA = 5;


    static double szklanki(double ilość) {

        return ilość * SZKLANKA;

    }

    static double łyżki(double ilość) {

        return ilość * ŁYŻKA;

    }


    static double łyżeczki(double ilość) {

        return ilość * ŁYŻECZKA;

    }

}
