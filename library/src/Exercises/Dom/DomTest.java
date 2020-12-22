package Exercises.Dom;

public class DomTest {

    public static void main(String[] args) {


        Dom dom1 = new Dom(10_000, 1000);
        String opis=dom1.getStatus();
        System.out.println(opis);

        dom1.takeShower();
        System.out.println(dom1.getStatus());

        dom1.watchTv(4);
        System.out.println(dom1.getStatus());

        dom1.boilWater();
        System.out.println(dom1.getStatus());

    }
}