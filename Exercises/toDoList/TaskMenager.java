package Exercises.toDoList;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskMenager {

    private Queue<Task> taskQueue= new PriorityQueue<>();
     Scanner sc=new Scanner(System.in);



     void mainLoop(){
         Option option;
         do{
             printOption();
             System.out.println("Wybierz opcje");
             option = Option.createFromInt(sc.nextInt());
             sc.nextLine();
             switch(option){
                 case ADD:
                     taskQueue.offer(readAndCreateTask());
                     break;
                 case TAKE:
                     takeTask();
                     break;
                 case EXIT:
                     System.out.println("Papa");
                     break;
             }
         }while(option != Option.EXIT);


     }

    private void takeTask() {
         if(taskQueue.isEmpty()){
             System.out.println("Brak zadań do wykonania");
         }else{
             Task nextTask = taskQueue.poll();
             System.out.println("Zadanie do wykonania");
             System.out.println(nextTask);
         }

    }

    private Task readAndCreateTask() {
        System.out.println("podaj nazwę zadania");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania");
        String description = sc.nextLine();
        System.out.println("Podaj priorytet");
        for (Task.Priority priority : Task.Priority.values()) {
            System.out.println(priority+" ");

        }
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine());
        return new Task(name, description, priority);

    }

    private void printOption() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);

        }


    }


    private enum Option{
         ADD(0, "Dodaj zadanie"),
         TAKE(1, "Zrób kolejne zadanie"),
         EXIT(2, "Wyjdź");


        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }



        static Option createFromInt(int option){
            return values()[option];
        }

        @Override
        public String toString() {
            return option +" "+description;
        }
    }

}
