package Exercises.polimorfizm;

public class AttackCharacter extends GameCharacter {

    private double extraAttack;

    public AttackCharacter(String name, int energy, int attack, int defense, double extraAttack) {
        super(name, energy, attack, defense);
        this.extraAttack = extraAttack;
    }



    double totalAttack(){

        return getAttack() + getAttack()* extraAttack;

    }

    public double getExtraAttack() {
        return extraAttack;
    }

    public void setExtraAttack(double extraAttack) {
        this.extraAttack = extraAttack;
    }
}
