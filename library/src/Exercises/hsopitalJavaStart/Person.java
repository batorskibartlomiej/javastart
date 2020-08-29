package Exercises.hsopitalJavaStart;

public class Person {

    private String name;
    private String lastname;
    private double salary;

    public Person(String name, String lastname, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getInfo(){

        return getName() +" " + getLastname()+ " "+ getSalary();
    }
}
