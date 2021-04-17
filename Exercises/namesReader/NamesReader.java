package Exercises.namesReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NamesReader {

    public static void main(String[] args) {

         final String file = "namespl.txt";
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });



        try{

             Scanner sc = new Scanner(new File(file));
             while(sc.hasNextLine()){
                 names.add(sc.nextLine());
             }
             System.out.println(names);
            System.out.println(names.first());
            System.out.println(names.last());


         } catch (FileNotFoundException e) {
             System.err.println("Brak pliku ");
         }


    }
}
