package Exercises.app;

import Exercises.data.Point;
import Exercises.współrzędne.PointController;

public class PointApplication {

    public static void main(String[] args) {


        Point p1 = new Point(10, 20);
        PointController pc = new PointController();

        final int addX=0;
        final int addY=1;
        final int minusX = 2;
        final int minusY = 3;

        int option = minusX;


        switch(option){
            case addX:
                pc.addX(p1);
                break;
            case addY:
                pc.addY(p1);
                break;
            case minusX:
                pc.minusX(p1);
                break;
            case minusY:
                pc.minusY(p1);
                break;
                default:
                    System.out.println("Złe wartości");

            }
        System.out.println("Po zmianie "+p1.getX()+";"+p1.getY());
        }

//        pc.changeObject(p1);
//
//        System.out.println("Punkt " + p1.getX() + ";" + p1.getY());
//        pc.addX(p1);
//        System.out.println("Punkt " + p1.getX() + ";" + p1.getY());
//        pc.addY(p1);
//        System.out.println("Punkt " + p1.getX() + ";" + p1.getY());
//        pc.minusX(p1);
//        System.out.println("Punkt " + p1.getX() + ";" + p1.getY());
//        pc.minusY(p1);
//        System.out.println("Punkt " + p1.getX() + ";" + p1.getY());





    }


