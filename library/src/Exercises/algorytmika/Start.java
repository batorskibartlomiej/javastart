package Exercises.algorytmika;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        int index = 0;
        int multi = 1;
        int next =0;

        Scanner input = new Scanner(System.in);

        //next=input.nextInt();
        while(index<5){
            next=input.nextInt();
            multi *=next;
            index++;
        }



        if(multi>=0){
            System.out.println("nieujmena");
        }else
            System.out.println("ujemna");


    }
}
