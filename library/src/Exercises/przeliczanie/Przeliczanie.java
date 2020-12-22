package Exercises.przeliczanie;

public class Przeliczanie {

    public static void main(String[] args) {

        ZamianaCzasu czas = new ZamianaCzasu();

        int minuty=czas.hNaM(14);
        System.out.println(minuty);

        int sekundy = czas.mNaS(minuty);
        System.out.println(sekundy);

        int milisekundy = czas.sNaMm(sekundy);
        System.out.println(milisekundy);


    }
}
