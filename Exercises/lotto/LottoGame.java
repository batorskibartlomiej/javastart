package Exercises.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        System.out.println("Witaj w grze");
        List<Integer> numbersFromUser= readNumbersFromUser();
        Lotto lotto = new Lotto();
        int score = lotto.checkLotto(numbersFromUser);
        List<Integer> lottoResult = lotto.getLottoResult();
        System.out.println("Twoje liczby to "+ numbersFromUser);
        System.out.println("Wynik losowania : "+lottoResult);
        System.out.println("Trafiłeś "+score+ " tyle razy");

    }

    private static List<Integer> readNumbersFromUser() {
        List<Integer> numbersFromUser= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <Lotto.MAX_NUMBERS ; i++) {
            System.out.println("Podaj kolejną liczbę");
            int n = scanner.nextInt();
            numbersFromUser.add(n);


        }
        return numbersFromUser;

    }


}
