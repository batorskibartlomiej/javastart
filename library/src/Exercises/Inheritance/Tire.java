package Exercises.Inheritance;

public class Tire extends Part {

    private int size;
    private int width;


    public Tire(int number, String name, String model, String series, int size, int width) {
        super(number, name, model, series);
        this.size = size;
        this.width = width;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    void printInfo() {
        System.out.println(getNumber()+","+getName()+","+getModel()+","+getSeries()+","+getSize()+","+getWidth());
    }


}
