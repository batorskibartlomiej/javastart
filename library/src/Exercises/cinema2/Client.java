package Exercises.cinema2;

public class Client {
    private String firstName1;
    private String lastName1;
    int age1;


    public Client(String firstName1, String lastName1, int age1) {
        this.firstName1 = firstName1;
        this.lastName1 = lastName1;
        this.age1 = age1;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public String getFullName(){
        return firstName1 + " "+ lastName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
