package Exercises.universytet;

public class Univers {


    public static void main(String[] args) {


        System.out.println(Student.getNUMBER());
        Student student1 = new Student("Bartek", "Batorski", 1);
        Student student2 = new Student("Bartek", "Nowak", 2);


        int liczba=Student.getNUMBER();
        System.out.println(liczba);


    }
}
