package Exercises.losowanie;

import java.util.Random;

public class LosowanieTest {

    public static void main(String[] args) {
        Losowanie test = new Losowanie();

        Random random = new Random();
        int number =random.nextInt(10000);

        test.compareNumberAndPrint(number, 1000);
        test.printOddorEven(number);
        System.out.println(test.getFourDigitNumber(number));
    }
}
