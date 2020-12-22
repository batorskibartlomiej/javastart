package Exercises.Dice;

import java.util.Random;

public class Dice {



    Random rand = new Random();
    int x;

    Dice(){

    }

    Dice(int x){
        this.x = x;

    }

    int roll() {

        this.x = rand.nextInt(6)+1;//bo zwraca od 0 do 5
        return x;
    }


    void showDice() {

        System.out.println("Liczba oczek na kostce: " + x);
    }
}
