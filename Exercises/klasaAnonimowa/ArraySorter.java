package Exercises.klasaAnonimowa;

import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
        Sortable sorti = new Sortable() {
            @Override
            public void sortMine(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 1; j < tab.length-1; j++) {
                        if (tab[j - 1] > tab[j]) {
                            int temp = tab[j ];
                            tab[j ] = tab[j-1];
                            tab[j-1]= temp;

                        }

                    }

                }


            }
        };


        int[] tab2 = {10, 2, 4, 6, 3, 8};
        printArray(tab2);
        sorti.sortMine(tab2);
        printArray(tab2);


        int [] tab3 ={3,6,1,0};
        printArray(tab3);
        Arrays.sort(tab3);
        printArray(tab3);

    }

       static void printArray( int tab[]){
            for (int i : tab) {
                System.out.print(i+" ");

            }
           System.out.println();

        }




    }

