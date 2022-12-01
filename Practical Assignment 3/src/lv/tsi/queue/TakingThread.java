package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread{
    BlockingQueue queue;
    public TakingThread(BlockingQueue queue){
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(queue.poll() + "has been taken");
    }
}
