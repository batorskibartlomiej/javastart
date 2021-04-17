package Exercises.addingProducts;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductsManager {

    private Scanner sc=new Scanner(System.in);
    private static final int ADD= 1;
    private static final int EXIT = 0;

    private static final int DISCARD_PRODUCT =0;
    private static final int REPLACE_PRODUCT =1;

    private Set<Products>productss = new HashSet<>();

    void mainLoop(){
        int option;
        do{
            printOptions();
            option=readOptions();
            evaluateOptions(option);


        }while(option!=EXIT);

    }

    private void evaluateOptions(int option) {
        if(option == ADD){
            addNextProduct();

        }else if(option == EXIT){
            printProducts();
        }else
            System.out.println("Nieznana opcja");

    }

    private void printProducts() {
        for (Products product : productss) {
            System.out.println(product);

        }
    }

    private void addNextProduct() {
        Products product= createProducts();
        if(productss.contains(product)){
            askAndReplace(product);
        }else{
            addProduct(product);
        }


    }

    private void askAndReplace(Products product) {
        System.out.println("Znaleziono produkt o takiej nazwie, wybierz co chcesz zrobić");
        System.out.println(" > Zignoruj produkt - " + DISCARD_PRODUCT);
        System.out.println(" > Nadpisz produkt - " + REPLACE_PRODUCT);
        int option = readOptions();
        //sc.nextLine();
        if(option == REPLACE_PRODUCT){
            productss.remove(product);
            addProduct(product);
        }else {
            System.out.println("W bazie pozostawiono poprzedni produkt");
        }
    }

    private void addProduct(Products product) {
        productss.add(product);
        System.out.println("produkt dodany do bazy");
    }

    private Products createProducts() {
        System.out.println("Podaj nazwę produktu");
        String name = sc.nextLine();
        System.out.println("Podaj cenę");
        double price = sc.nextDouble();


        return new Products(name, price);
    }

    private int readOptions() {
        System.out.println("Wybierz opcję");
        int option=sc.nextInt();
        sc.nextLine();
        return option;


    }

    private void printOptions() {
        System.out.println("Dostępne opcje ");
        System.out.println(" > Dodaj nowy produkt - " + ADD);
        System.out.println(" > Koniec programu - " + EXIT);
    }
}
