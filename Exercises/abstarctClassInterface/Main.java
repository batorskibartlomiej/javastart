package Exercises.abstarctClassInterface;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean read = false;


        while (!read) {
            try {
                printOptions();
                shape = shapeCalc.createShape();
                read = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś dane w złym formacie, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształtu jest niepoprawny, spróbuj ponownie");
            } finally {
                shapeCalc.clearBuffer();


            }
            System.out.println(shape);



        }
    }

    private static void printOptions() {
        System.out.println("Wybierz figurę dla jakiej chcesz obliczyć dane: ");
        System.out.println(Shape.RECTANGLE + " -prostokąt");
        System.out.println(Shape.CIRCLE + "-koło");
        System.out.println(Shape.TRIANGLE + "-trójkąt");
    }
}