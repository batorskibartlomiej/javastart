package Exercises.addingNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    private static Scanner sc = new Scanner(System.in);
    private static final String EXIT= "exit";
    public static void main(String[] args) {

        List<Double>numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);


    }

    private static void printData(List<Double> list) {
        if(!list.isEmpty()){
            StringBuilder sb = new StringBuilder();
            double sum= 0;
            for (Double d : list) {
                sb.append(d);
                sb.append("+");
                sum = sum + d;

                
            }

            sb.replace(sb.length()-1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }

    }

    
    private static void fillList(List<Double> list) {
        System.out.println("Podaj liczby albo wpisz exit dla zakończenia");
        String input = sc.nextLine();
        if(input.equals(SumNumbers.EXIT)){
            return;
        }
        try{
            list.add(Double.valueOf(input));

        } catch (NumberFormatException e) {
            System.err.println("To nie jest liczba");
        }

        fillList(list);


    }


}
