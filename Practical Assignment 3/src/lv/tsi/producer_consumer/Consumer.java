package lv.tsi.producer_consumer;

public class Consumer extends Thread {
    Goods goods;

    public Consumer(Goods goods) {
        super();
        this.goods = goods;
    }

    @Override
    public void run() {
        try {
            goods.consume();
            System.out.println("Consumed: 5");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
