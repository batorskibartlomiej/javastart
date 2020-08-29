package Exercises.Inheritance2;

public class Bootcamp extends OnlineCourse {

    private String teachersName;

    private int consultationHours;


    public Bootcamp(int courseNumber, int coursePrice, String courseName, String courseTheme, int numberOfminutes, int timeToFinish, String teachersName,int consultationHours ) {
        super(courseNumber, coursePrice, courseName, courseTheme, numberOfminutes, timeToFinish);
        this.teachersName = teachersName;
        this.consultationHours = consultationHours;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }

    void printInfo(){

        System.out.println(getCourseName()+" "+getCoursePrice()+" "+getCourseName()+" "+getCourseTheme()+" "+getNumberOfminutes()+" "+getTimeToFinish()+" "+getTeachersName()+" "+getConsultationHours());
    }
}
