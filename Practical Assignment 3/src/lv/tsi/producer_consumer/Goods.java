package lv.tsi.producer_consumer;

public class Goods {
    int amount;

    synchronized void produce(int amount) throws InterruptedException {
        while (true) {
            this.amount = amount;
            notify();
            wait();
        }
    }

    synchronized int consume() throws InterruptedException {
        while (true) {
            wait();
            notify();
            return amount;
        }
    }
}
