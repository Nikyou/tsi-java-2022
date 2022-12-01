package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread{
    BlockingQueue queue;
    public AddingThread(BlockingQueue queue){
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            queue.add("Element" + i);
            System.out.println(queue.peek() + " has been added");
        }
    }
}
