package Exercises.Inheritance;

public class Part {

    private int number;
    private String name;
    private String model;
    private String series;


    public Part(int number, String name, String model, String series) {
        this.number = number;
        this.name = name;
        this.model = model;
        this.series = series;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
