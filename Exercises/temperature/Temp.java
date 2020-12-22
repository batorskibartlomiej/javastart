package Exercises.temperature;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę");
        double tempPokoju = scanner.nextInt();
        System.out.println("Podaj temperaturę docelową");
        int tempDocelowa = scanner.nextInt();

        TempClass temp= new TempClass(tempPokoju, tempDocelowa);
        while(!temp.roznica()){
            System.out.println("Aktualna temp "+temp.getTempPokoju());
            temp.zmianaTemp();


        }




        System.out.println("Osiagnięto "+temp.getTempPokoju());


//        while(roznica>0){
//            if(tempPokoju<tempDocelowa){
//                tempPokoju+=stopien;
//                System.out.println(tempPokoju);
//            }if(tempPokoju>tempDocelowa){
//                tempPokoju-=stopien;
//            }
//
//        }


    }
}
