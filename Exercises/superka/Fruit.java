package Exercises.superka;

public class Fruit {

    double weight;
    String typeOfFruit;

    public Fruit(double weight, String typeOfFruit) {
        this.weight = weight;
        this.typeOfFruit = typeOfFruit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public void setTypeOfFruit(String typeOfFruit) {
        this.typeOfFruit = typeOfFruit;
    }


    public void getInfo() {

        System.out.println(getTypeOfFruit()+" "+getWeight());
    }
}
