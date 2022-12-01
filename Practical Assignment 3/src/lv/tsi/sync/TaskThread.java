package lv.tsi.sync;

public class TaskThread extends Thread{
    TaskManager manager;
    int taskId;

    public TaskThread(String name, int taskId, TaskManager manager){
        super();
        this.setName(name);
        this.taskId = taskId;
        this.manager = manager;
    }

    @Override
    public void run() {
        try {
            manager.performTask(taskId);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
