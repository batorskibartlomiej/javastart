package Exercises.Dom;

public class Dom {

    double water;
    double fuel;

    Dom(double woda, double ropa) {
        water = woda;
        fuel = ropa;
    }

    void takeShower() {
       water= water - 48;


    }

    void takeBath() {

        water=water - 86;
    }

    void makeDinner() {

        water = water - 4;
        fuel = fuel - 0.1;
    }

    void boilWater() {
        water = water - 0.5;
        fuel = fuel - 0.05;
    }

    void watchTv(int h){
        double fuelCosumption = h*0.06;
        fuel=fuel -fuelCosumption;
    }

    String getStatus() {
        return "Ilość wody: " + water + " litrów, ropa: " + fuel + " litrów";
    }






}

