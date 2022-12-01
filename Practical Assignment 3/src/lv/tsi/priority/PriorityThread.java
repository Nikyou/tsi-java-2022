package lv.tsi.priority;

public class PriorityThread extends Thread {
    public PriorityThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(this.getName() + " " + i);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
