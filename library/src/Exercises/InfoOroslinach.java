package Exercises;

public class InfoOroslinach {

    public static void main(String[] args) {
        Roślina rosl1 = new Roślina();
        Roślina ros2 = new Roślina();

        rosl1.info = 1.0;
        rosl1.nazwa = "Hortencja";
        rosl1.opis = "żółta";

        double zuzycieDzienne =  rosl1.info;
        double tyg= rosl1.info*7;
        double roczne = rosl1.info*365;



        System.out.println();

    }
}
