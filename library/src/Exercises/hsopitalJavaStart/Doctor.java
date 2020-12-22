package Exercises.hsopitalJavaStart;

public class Doctor extends Person {

    private double bonus;

    public Doctor(String name, String lastname, double salary, double bonus) {
        super(name, lastname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfo() {
        return super.getInfo() + ", Premia: " + bonus;
    }
}
