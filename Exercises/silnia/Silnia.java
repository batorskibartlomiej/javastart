package Exercises.silnia;

public class Silnia {

    public static void main(String[] args) {
        //int i = liczSilnie(10);
        //System.out.println(i);

    int liczba = 10;
    int result = liczSilnieRek(liczba);
        System.out.println(result);


    }


    public static int liczSilnie(int a) {
        int wynik = 1;
        while (a > 1) {

            wynik = wynik * a;
            a--;
        }
        return wynik;

    }

    public static int liczSilnieRek(int a) {

        if (a > 1) {
            System.out.println(a + "*" + "liczSilnieRek(" + (a - 1) + ")");
            return a * liczSilnieRek(a - 1);
        }else{
            return 1;
        }


    }
}


