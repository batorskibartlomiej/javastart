package Exercises;

public class Comapany {

    public static void main(String[] args) {

        KlasaZad1 employer1 = new KlasaZad1();
        KlasaZad1 employer2 = new KlasaZad1();
        KlasaZad1 employer3 = new KlasaZad1();

        employer1.name = "Piotr";
        employer2.name = "Bartek";
        employer3.name = "Józef";

        employer1.surname = "Batorski";
        employer1.birthDate = 1984;
        employer1.workTime = 13;

        String info= employer1.name+" "+employer1.surname+" "+employer1.birthDate+" "+employer1.workTime;
        System.out.println(info);
    }
}
