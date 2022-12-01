package lv.tsi.producer_consumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Consumer thread1 = new Consumer(goods);
        Producer thread2 = new Producer(goods);

        thread1.start();
        thread2.start();
    }
}
