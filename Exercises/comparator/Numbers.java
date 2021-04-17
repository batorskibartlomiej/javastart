package Exercises.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers {
    public static void main(String[] args) {


        Integer []numbers = {1,5,10,30,4,2,7,19,3,7};

        System.out.println("nieposortowane "+ Arrays.toString(numbers));


        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });


        System.out.println("posortowane" + Arrays.toString(numbers) );









    }




}
