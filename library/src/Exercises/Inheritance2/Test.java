package Exercises.Inheritance2;

public class Test {

    public static void main(String[] args) {


        OnlineCourse online = new OnlineCourse(1, 100, "JAVASTART",
                "JAVA", 60, 300);
        Bootcamp bootcamp = new Bootcamp(1, 100, "JAVASTART", "JAVA",
                60, 300, "Batorski Bartłomiej", 50);

        online.printInfo();
        bootcamp.printInfo();

    }
}
