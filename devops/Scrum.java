package scr;

import java.util.*;
public class Scrum {
    ArrayList<Task> taskboard = new ArrayList<Task>();
     
    public void addTask(Task task){
        taskboard.add(task);
        System.out.println("Tarefa adicionada ao quadro.");
    }

    public void viewTask(Task task) {
        System.out.println(task);
    }

    public void markTaskCompleted(Task index){
        for (int i = 0; i < taskboard.size(); i++){
            taskboard.get(i).markAsCompleted();
        }
    }
}
