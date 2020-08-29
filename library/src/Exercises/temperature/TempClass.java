package Exercises.temperature;

public class TempClass {

    private double tempPokoju;
    private int tempDocelowa;

    public double getTempDocelowa() {
        return tempDocelowa;
    }

    public void setTempDocelowa(int tempDocelowa) {
        this.tempDocelowa = tempDocelowa;
    }

    public double getTempPokoju() {
        return tempPokoju;
    }

    public void setTempPokoju(int tempPokoju) {
        this.tempPokoju = tempPokoju;
    }

    public TempClass( double tempPokoju,int tempDocelowa ) {
        this.tempDocelowa = tempDocelowa;
        this.tempPokoju = tempPokoju;
    }

    boolean roznica(){
        return  tempPokoju==tempDocelowa;
    }


    void zmianaTemp(){
        double roznicaTemp = tempDocelowa-tempPokoju;
        if(roznicaTemp>0){
            tempPokoju+=0.5;
        }else{
            tempPokoju-=0.5;
        }
    }

}
