package Exercises.toDoList;

public class Task implements Comparable<Task>{

    private String name;
    private String description;
    private Priority priority;

    @Override
    public String toString() {
        return name + " - " + description;
    }

    public Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task o) {
        return priority.compareTo(o.priority);
    }

    public enum Priority{

        HIGH, MEDIUM, LOW
    }


}
