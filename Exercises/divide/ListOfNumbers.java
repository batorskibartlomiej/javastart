package Exercises.divide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {

    public static void main(String[] args) {


        List<Integer> numbers = readNUmbersFromUser();


        showStatistic(numbers);


    }

    private static void showStatistic(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;

        }
        double avg = sum/numbers.size();
        System.out.println("Ile poprawnych liczb: " + numbers.size());
        System.out.println("Ich suma wynosi: " + sum);
        System.out.println("Natomiast średnia to: " + avg);
    }

    private static List<Integer> readNUmbersFromUser() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int next = 0;
        boolean numberIsCorect = true;


        while(numberIsCorect){
        System.out.println("Podaj liczby nieujemne i podzielne przez 5");
        next = sc.nextInt();
        if(next > 0 && next% 5 ==0){
            numbers.add(next);

        }else{
            numberIsCorect= false;
        }

        }
        return numbers;
    }
}
