package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class BlockingMain {
    public static void main(String[] args) {
        final BlockingQueue queue = null;   //cannot initialize an abstract class, assignment not clear
        AddingThread adder = new AddingThread(queue);
        TakingThread taker = new TakingThread(queue);

        adder.start();
        taker.start();
    }
}
