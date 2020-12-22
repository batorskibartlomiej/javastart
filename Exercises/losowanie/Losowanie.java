package Exercises.losowanie;

import java.util.Random;

public class Losowanie {





       // int compareTo = 1000;


        void compareNumberAndPrint( int number, int compareTo) {
            if (number == compareTo)
                System.out.println(number + " jest równa " + compareTo);
            else if (number > compareTo)
                System.out.println(number + " jest większa od " + compareTo);
            else
                System.out.println(number + " jest mniejsza od " + compareTo);
        }


        void printOddorEven(int number) {
            if (number % 2 == 0) {
                System.out.println(number + " jest parzysta");
            } else {
                System.out.println(number + " jest nieparzysta");
            }
        }

    int getFourDigitNumber(int number) {
        if (number == 0)
            return 0;
        else if (number / 1000 != 0)
            return number;
        else if (number / 100 != 0)
            return number * 10;
        else if (number / 10 != 0)
            return number * 100;
        else
            return number * 1000;
    }













    }

