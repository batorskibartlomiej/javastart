package Exercises.Inheritance2;

public class StationaryCourse extends Course{

    private String city;
    private int numberOfLessons;

    public StationaryCourse(int courseNumber, int coursePrice, String courseName, String courseTheme, String city,int numberOfLessons) {
        super(courseNumber, coursePrice, courseName, courseTheme);
        this.city = city;
        this.numberOfLessons = numberOfLessons;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }
}
