package pl.javaadvanced.solid.dip;

public class TaskService {

    private FileRepository repository = new FileRepository();

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(int taskId) {
        repository.deleteTask(taskId);
    }
}