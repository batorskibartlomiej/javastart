package Exercises.Inheritance2;

public class Course {

    private int courseNumber;
    private int coursePrice;
    private String  courseName;
    private String courseTheme;

    public Course(int courseNumber, int coursePrice, String courseName, String courseTheme) {
        this.courseNumber = courseNumber;
        this.coursePrice = coursePrice;
        this.courseName = courseName;
        this.courseTheme = courseTheme;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTheme() {
        return courseTheme;
    }

    public void setCourseTheme(String courseTheme) {
        this.courseTheme = courseTheme;
    }
}
