package Exercises.mapsFromFile;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductManager {

    public static void main(String[] args) {

        try {
            Map<String, TreeSet<Product>>productsMap = ProductImporter.readFile("products.csv");
            String category= readCategoryFormuUser();
            printCategoryStats(productsMap,category);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void printCategoryStats(Map<String, TreeSet<Product>> productsMap, String category) {
        TreeSet<Product>products = productsMap.get(category);
        if(products==null){
            System.out.println("Brak produktów  w tej kategorii");
        }else{
            printAll(products);
            printAvgPrice(products);
            printCheapestAndExpensiveProduct(products);

        }




    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt to "+ products.first() );
        System.out.println("Najdroższy produkt to "+ products.last());
    }

    private static void printAvgPrice(TreeSet<Product> products) {
        double sumPrice=0;
        for (Product product : products) {
            sumPrice+=product.getPrice();

        }double avgPrice= sumPrice/products.size();
        System.out.println("Średnia cena produktów: " + avgPrice);
    }

    private static void printAll(TreeSet<Product> products) {
        for (Product product : products) {
            System.out.println(product);

        }

    }

    private static String readCategoryFormuUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz kategorię");
        return sc.nextLine();

    }


}
