package Exercises.string;

import java.util.Scanner;

public class ChangeLetters {

    public static void main(String[] args) {
        String text = readTextFromUser();
        text = changeTextToUpperOrLowerCase(text);
        System.out.println("Tekst po transformacji:");
        System.out.println(text);
    }

    private static String changeTextToUpperOrLowerCase(String text) {
        char firstCharacter = text.charAt(0);
        if (Character.isUpperCase(firstCharacter)) {
            text = text.toUpperCase();
        } else if (Character.isLowerCase(firstCharacter)) {
            text = text.toLowerCase();
        }
        return text;
    }

    private static String readTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst:");
        return scanner.nextLine();
    }
}