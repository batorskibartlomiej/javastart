package Exercises.typyGeneryczne;

public class PairTest {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Bartek", 1989);
        Pair<Double, Integer> p2 = new Pair<>(28900.5, 196);
        Pair<Integer, Integer> p3 = new Pair<>(2890, 196);


        printPair(p2);

    }


         static<T,V> void printPair (Pair < T, V > pair){

            System.out.println("<" + pair.getT() + pair.getV() + ">");


        }
    }


