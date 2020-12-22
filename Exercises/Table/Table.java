package Exercises.Table;

import java.sql.SQLOutput;

public class Table {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};
        int[] numbers2 = {4,5,6};


            System.out.println("SUMA = ");
            System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers2[0]+numbers2[1]
            +numbers2[2]);


            Sum sum1 = new Sum();
            int liczba =sum1.sum(numbers, numbers2);
            System.out.println("liczba wynosi "+liczba);


            sum1.suma(numbers,numbers2);


    }
}
