package Exercises.ZapisOdczyt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class numbersReader {

    public static void main(String[] args)  {

        final String file = "numbers.txt";



            try (
                    var fr = new FileReader(file);
                    var br = new BufferedReader(fr);


            ) {
                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
                int c = Integer.parseInt(br.readLine());
                BigDecimal d = new BigDecimal(br.readLine());
                BigDecimal e = new BigDecimal(br.readLine());
                System.out.println("a + b + c = "+(a+b+c) );
                System.out.println("Big d + big e = "+(d.add(e)));




        } catch (FileNotFoundException e) {
                System.err.println("Nie znaleziono pliku");
            } catch (IOException e) {
                System.err.println("Błąd odczytu danych");
            }
    }
}
