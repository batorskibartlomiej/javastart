package Exercises;

import java.util.Random;

public class Zadanie1 {

    public static void main(String[] args) {
        Random rand =  new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(20);

        int add = x+y;

        boolean result =  x>y;


        System.out.println("Czy x jest większe od y "+x+">"+y+" " + result);

        int mnożenie = x*2;
        result =  x>y;

        System.out.println("Czy x pomnożone przez 2 jest większe od y "+x+"*2"+">"+y+" " + result);


        int suma = x+2;
        int minus = x-2;
        result =  y<suma&&y>minus;

        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? "+y+"<"+x+"+3"+"oraz"+">"+x+"-2 " + result);



        result = ((x*y)%2==0);
        System.out.println("Czy x*y jest parzyste? " + result);
    }
}
