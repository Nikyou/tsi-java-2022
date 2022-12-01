package lv.tsi.sync;

public class SyncMain {
    public static void main(String[] args) {
        final TaskManager manager = new TaskManager();
        TaskThread thread1 = new TaskThread("Alfred", 12, manager);
        TaskThread thread2 = new TaskThread("John", 6, manager);

        thread1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
