package Exercises.Calculator;

public class Calculator {

    double add(double x, double y){
        return x+y;
    }

    double add(double x, double y, double z){
        return add(x,y)-z;
    }

    double subtract(double x, double y) {

        return x - y;
    }

    double subtract(double x, double y, double z) {

        return subtract(x , y)-z;
    }

    double multiply(double x , double y) {

        return x*y;
    }

    double divide(double x, double y) {

        return x/y;
    }
}
