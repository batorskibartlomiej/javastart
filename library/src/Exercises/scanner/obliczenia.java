package Exercises.scanner;


public class obliczenia {






    public double calculate(double a, double b, String operator) {
        double result=0;

        switch (operator) {
            case "+":
                result = (a + b);

                break;
            case "-":
                result = (a - b);

                break;
            case "/":
                result = a/b;

                break;
            case "*":
                result = (a*b);
                break;
        }
            return result;

    }
}
