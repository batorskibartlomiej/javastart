package Exercises.computerShop;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;

    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersNumber;


    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];


        }
        return comps;
    }

    public void add(Computer comp){
        if(computersNumber< MAX_COMPUTERS && comp != null){
            computers[computersNumber]=comp;
            computersNumber++;

        }


    }


    int checkAvailability(Computer find) {
        if(find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computersNumber; i++) {
            if(find.equals(computers[i]))
                count++;

        }
        return count;
    }
}
