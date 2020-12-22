package Exercises.hsopitalJavaStart;

public class Hospital {

    private static final int MAX_EMPLOYEES = 3;

    private Person [] employers = new Person[MAX_EMPLOYEES];
    private int employersNumber= 0;

    public void add(Person person){
        if(employersNumber<MAX_EMPLOYEES){
            employers[employersNumber]=person;
            employersNumber++;
        }
    }


    String getInfo() {
        String result = "";
        for (int i = 0; i < employersNumber; i++) {
            result = result + employers[i].getInfo() + "\n";
        }
        return result;
    }


}
