package scr;

public class Task {
    private String Decription;
    private boolean Completed;

    public Task(String descricao) {
        this.Decription = descricao;
        this.Completed = false;
        System.out.println("Nova tarefa adicionada: " + descricao);
    }
    public String getDecription() {
        return Decription;
    }
    public void markAsCompleted() {
        this.Completed = true;
    }
    public void setCompleted(boolean completed) {
        Completed = completed;
    }
    public void setDecription(String decription) {
        Decription = decription;
    }

}