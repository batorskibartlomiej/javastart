package Exercises.string;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wyrazów chcvesz podać ?");
        int word = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[word];
        for (int j = 0; j <word; j++) {
            System.out.println("Podaj kolejne słowo: ");
            words[j] = scanner.nextLine();

        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < word; i++) {
            build.append(words[i].charAt(words[i].length() - 1));
        }

        System.out.println("Nowe słowo: " + build.toString());

        scanner.close();
    }


}

            




