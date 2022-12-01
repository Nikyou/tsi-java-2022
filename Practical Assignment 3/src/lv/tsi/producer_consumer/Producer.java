package lv.tsi.producer_consumer;

public class Producer extends Thread{
    Goods goods;
    public Producer(Goods goods){
        super();
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){
            try {
                goods.produce(5);
                System.out.println("Produced: 5");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
