package Exercises.hsopitalJavaStart;

public class Nurse extends Person {

    private double overtime;

    public Nurse(String name, String lastname, double salary, double overtime) {
        super(name, lastname, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public String getInfo() {
        return super.getInfo() + ", Nadgodziny: " + overtime;
    }
}
