package Exercises.Inheritance2;

public class OnlineCourse extends Course{

    private int numberOfminutes;
    private int timeToFinish;

    public OnlineCourse(int courseNumber, int coursePrice, String courseName, String courseTheme, int numberOfminutes, int timeToFinish ) {
        super(courseNumber, coursePrice, courseName, courseTheme);
        this.numberOfminutes = numberOfminutes;
        this.timeToFinish = timeToFinish;
    }

    public int getNumberOfminutes() {
        return numberOfminutes;
    }

    public void setNumberOfminutes(int numberOfminutes) {
        this.numberOfminutes = numberOfminutes;
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }

    void printInfo(){

        System.out.println("Informacje o kursie " +getCourseName()+" "+"Cena: " + getCoursePrice()+" "+"Identyfikator: " +getCourseName()+" "+getCourseTheme()+" "+getNumberOfminutes()+" "+getTimeToFinish());
    }
}
