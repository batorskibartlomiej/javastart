package Exercises.company;

public class FullTimeEmployee extends Employee {

    private static final double YEARLY_BONUS = 0.05;
    private double baseSalary;

    public FullTimeEmployee(String firstName, String lastName, double baseSalary) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
    }



    public static double getYearlyBonus() {
        return YEARLY_BONUS;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    protected double getMonthlySalary() {
        return getBaseSalary();
    }

    @Override
    protected double getYearlySalary() {
        double yearlyBaseSalary= getBaseSalary()* MONTHS;
        double bonus = baseSalary * YEARLY_BONUS;
        return yearlyBaseSalary+bonus;
    }
}
