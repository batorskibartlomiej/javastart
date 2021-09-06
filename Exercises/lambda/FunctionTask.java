package Exercises.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class FunctionTask {

    public static void main(String[] args) {


        Random random = new Random();

        //Supplier<Integer> supplier = () -> random.nextInt(1000);
        List<Integer> numberList = new ArrayList<>();
        generate(numberList, 10, ()-> random.nextInt(1000));
        System.out.println(numberList);
        //Consumer<Integer>consumer = x-> System.out.print(x+" ");
        printNUmbers(numberList, x-> System.out.print(x+" "));
        System.out.println();
        filterList(numberList, x->x%2==0);
        printNUmbers(numberList, x-> System.out.print(x+" "));





    }

        private static<T> void filterList(List<T> list, Predicate<T>predicate){
            Iterator<T>iterator = list.iterator();
            while(iterator.hasNext()){
                T next = iterator.next();
                if(predicate.test(next)){
                    iterator.remove();
                }
            }




        }


        private static <T> void printNUmbers(List<T> list, Consumer<T> consumer) {
            for (T t :list){
                consumer.accept(t);
            }
        }



        private static <T> void generate(List<T> list, int toGenerate, Supplier<T> sup){
            for(int i=0; i<toGenerate; i++){
                list.add(sup.get());
            }

        }


    }


