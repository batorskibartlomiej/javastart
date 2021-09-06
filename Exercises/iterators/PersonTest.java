package Exercises.iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonTest {

    public static void main(String[] args) {

         Map<String,Person> people= new TreeMap<>();

         people.put("Kowalski", new Person("Bartek", "Kowalski", 13));
         people.put("Batorski", new Person("Bartek", "Batorski", 19));
        people.put("Adamkiewicz", new Person("Bartek", "Adamkiewicz", 19));

        Collection<Person> values = people.values();

        Iterator<Person> iterator = values.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
