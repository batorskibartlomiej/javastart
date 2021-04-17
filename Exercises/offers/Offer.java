package Exercises.offers;

import java.util.Comparator;

public class Offer implements Comparable<Offer> {

    private String city;
    private double price;
    private double area;

    @Override
    public String toString() {
        return  city +" " + price+" " + area +" "+ String.format("%.2f",getOfferPricePerSqm())+"m2";

    }

    public Offer(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }


    public double getOfferPricePerSqm(){
        return price/area;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public int compareTo(Offer o) {
        return Double.compare(getOfferPricePerSqm(), o.getOfferPricePerSqm());
    }
}
