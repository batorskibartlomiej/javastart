package Exercises.streamcd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum {

    public static void main(String[] args) {

        final String file = "lorem.txt";


        List<String> words = null;
        try {
            words = readFile(file);
            showWordsStats(words);
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku");
        }


    }

    private static void showWordsStats(List<String> words) {
        words = words.stream()
                .map(s -> s.replaceAll(",", "").replaceAll("//.", ""))
                .collect(Collectors.toList());
        System.out.println(words);


        long countWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(System.out::println)
                .count();

        System.out.println("Liczba wyrazów na s= " + countWords);


        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(System.out::println)
                .count();

        System.out.println("5 znaków =" + fiveLetters);
    }

    private static List<String> readFile(String file) throws IOException {
        List<String> words = new ArrayList<>();

        try (var bufferedReader = new BufferedReader(new FileReader(file))) {


            String tmp = null;


            while ((tmp = bufferedReader.readLine()) != null) {

                words.addAll(Arrays.asList(tmp.split(" ")));

            }
            return words;
        }
    }
}
