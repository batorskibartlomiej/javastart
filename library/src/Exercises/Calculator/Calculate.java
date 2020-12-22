package Exercises.Calculator;

public class Calculate {

    public static void main(String[] args) {

        double x = 12;
        double y =6;

        Calculator calculator = new Calculator();

        double addResult = calculator.add(x,y);

        System.out.println(addResult);


    }
}
