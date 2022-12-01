package lv.tsi.sync;

import static java.lang.Thread.currentThread;

public class TaskManager {
    synchronized void performTask(int taskId) throws InterruptedException {
        System.out.println(currentThread().getName() + " " + taskId);
        Thread.sleep(4);
        System.out.println(currentThread().getName() + " " + taskId);
    }
}
