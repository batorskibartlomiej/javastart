package Exercises.superka;

public class Apple extends Fruit {

    String typeOfApple;

    public String getTypeOfApple() {
        return typeOfApple;
    }

    public void setTypeOfApple(String typeOfApple) {
        this.typeOfApple = typeOfApple;
    }

    public Apple(double weight,  String typeOfApple) {
        super(weight, "jabłkowaty");
        this.typeOfApple = typeOfApple;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println(getTypeOfApple());



    }

}
