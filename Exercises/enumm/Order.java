package Exercises.enumm;

public class Order {

    private String name;
    private double price;
    private OrderStatus status;

    public Order(String name, double price, OrderStatus status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  name  + "("+
                 price + " "+"zł)"+
                 status
                ;
    }
}
