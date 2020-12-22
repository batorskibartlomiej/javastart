package Exercises.exceptions;

public class DuplicateException extends RuntimeException {

    private Participant participant;

    public Participant getParticipant() {
        return participant;
    }

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }
}
