package Exercises.dataTime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Żeby rozpocząć pomiar czasu wciśnij ENTER");
        sc.nextLine();
        Instant now1 = Instant.now();
        System.out.println("Żeby zatrzymać pomiar czasu wcisnij ENETER");
        sc.nextLine();
        Instant now2 = Instant.now();

        Duration time = Duration.between(now1, now2);
        System.out.println("Czas, który upłynął "+ time.getSeconds());



    }
}
