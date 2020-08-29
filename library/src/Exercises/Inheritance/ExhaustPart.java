package Exercises.Inheritance;

public class ExhaustPart extends Part {

    private boolean europeanStandard;


    public ExhaustPart(int number, String name, String model, String series, boolean europeanStandard) {
        super(number, name, model, series);
        this.europeanStandard=europeanStandard;
    }


    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }

    void printInfo(){
        System.out.println(getNumber()+","+getName()+","+getModel()+","+getSeries()+","+europeanStandard);
    }
}
