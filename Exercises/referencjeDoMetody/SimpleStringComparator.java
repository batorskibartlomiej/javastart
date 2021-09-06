package Exercises.referencjeDoMetody;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleStringComparator {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bartek", "Zosia", "Maja", "Wojciech");


       Collections.sort(names, String::compareToIgnoreCase);
       names.forEach(System.out::println);


    }
}
