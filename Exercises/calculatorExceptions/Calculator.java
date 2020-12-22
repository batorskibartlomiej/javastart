package Exercises.calculatorExceptions;

public class Calculator {

    public static double calculate(double a, double b, String operator) {
    double result = 0;

    switch(operator){
        case "+":
            result= a+b;
            break;
        case "-":
            result= a-b;
            break;
        case "/":
            if(b==0)
                throw new ArithmeticException("dzielnik jest 0");

                result = a / b;
                break;
        case "*":
            result = a*b;
            break;
        default:

            throw new UnknownOperatorException("nieznany operator");

    }


        return result;
    }



}



