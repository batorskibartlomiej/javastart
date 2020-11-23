package Exercises.exceptions;

public class MaxCompetitorsException extends RuntimeException{

    private final int maxCompetitors;

    public int getMaxCompetitors() {
        return maxCompetitors;
    }

    public MaxCompetitorsException(int maxCompetitors) {
        this.maxCompetitors = maxCompetitors;
    }
}
