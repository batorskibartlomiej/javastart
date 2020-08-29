package Exercises.universytet;

public class Student {

    private String name;
    private String surnName;
    private int indexNumeber;
    private static int NUMBER;


    public Student(String name, String surnName, int indexNumeber) {
        this.name = name;
        this.surnName = surnName;
        this.indexNumeber = indexNumeber;
        NUMBER++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnName() {
        return surnName;
    }

    public void setSurnName(String surnName) {
        this.surnName = surnName;
    }

    public int getIndexNumeber() {
        return indexNumeber;
    }

    public void setIndexNumeber(int indexNumeber) {
        this.indexNumeber = indexNumeber;
    }

    public static int getNUMBER() {
        return NUMBER;
    }

    public static void setNUMBER(int NUMBER) {
        Student.NUMBER = NUMBER;
    }




}
