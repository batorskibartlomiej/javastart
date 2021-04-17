package Exercises.ZapisOdczyt;

import java.util.Scanner;

public class WordStatistics {

    public static void main(String[] args) {
        String word = readFromusers();
        int digits = countNumbers(word);
        System.out.println("Liczba cyfr w tekście to " + digits);
        int letters = countsLetters(word);
        System.out.println("liczba liter w tekście to "+letters);
        try {
            int biggestNumber = findBigestDigit(word);
            System.out.println("Największa cyfra to " + biggestNumber);
        }catch (DigitNotFoundException e){
            System.err.println("Brak cyfr w zdaniu");
        }

    }

    private static int findBigestDigit(String word) {
        char[]chars = word.toCharArray();
        final int notFound = -1;
        int biggestNumber = notFound;
        for (char aChar : chars) {
            if(Character.isDigit(aChar)){
                int digit = Character.getNumericValue(aChar);
                biggestNumber = Integer.max(biggestNumber,digit);
            }

        }
        if(biggestNumber==notFound)
            throw new DigitNotFoundException();


        return biggestNumber;




    }

    private static int countsLetters(String word) {
        char[] chars = word.toCharArray();
        int letters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letters++;
            }

        }return letters;


    }


    private static int countNumbers(String word) {

        char[] chars = word.toCharArray();
        int digits = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                digits++;
            }

        }return digits;


    }



    private static String readFromusers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakiś tekst a ja wszystko zliczę ");
        return scanner.nextLine();

    }

    private static class DigitNotFoundException extends RuntimeException {
    }
}
