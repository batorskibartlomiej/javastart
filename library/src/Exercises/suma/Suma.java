package Exercises.suma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Suma {


    public static void main(String[] args) {

        int suma=0;
        int next=0;

        Scanner scanner = new Scanner(System.in);
        while((next = scanner.nextInt())<=100){
            suma+=next;
        }

        int mod = suma%2;

        if(mod==0){
            System.out.println("Parzysta"+ suma);

        }else
            System.out.println("nie parzysta"+suma);











    }
}
