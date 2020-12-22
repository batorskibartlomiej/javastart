package Exercises.polimorfizm;

public class DefenseCharacter extends GameCharacter {

    private double extraDefense;

    public double getExtraDefense() {
        return extraDefense;
    }

    public void setExtraDefense(double extraDefense) {
        this.extraDefense = extraDefense;
    }

    public DefenseCharacter(String name, int energy, int attack, int defense, double extraDefense) {
        super(name, energy, attack, defense);
        this.extraDefense = extraDefense;
    }

    double totalDefense() {
        return getDefense() + getDefense() * extraDefense;
    }



}
