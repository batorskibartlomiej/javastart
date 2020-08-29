package pl.javastart.application;


import pl.javastart.logic.Charger;
import pl.javastart.model.model.Telephone;


public class PhoneTest {
    public static void main(String[] args) {

        Charger ch= new Charger();
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
//        System.out.println(telephone.getBrand()
//                + " " + telephone.getModel()
//                + ", bateria: " + telephone.getBatteryCapacity() +"mAh"
//                + ", poziom naładowania: " + telephone.getChargeLevel() + "%");

        telephone.printInfo();
        ch.charge(telephone);

        telephone.printInfo();
        ch.charge(telephone);
        telephone.printInfo();

    }
}
