package pl.javastart.logic;


import pl.javastart.model.model.Telephone;

public class Charger {


    public void charge(Telephone phone){

        phone.setChargeLevel(phone.getChargeLevel()+1);
    }


}
