package lv.tsi.priority;

import static java.lang.Thread.*;

public class PriorityMain {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread("min");
        PriorityThread thread2 = new PriorityThread("norm");
        PriorityThread thread3 = new PriorityThread("max");

        thread1.setPriority(MIN_PRIORITY);
        thread2.setPriority(NORM_PRIORITY);
        thread3.setPriority(MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
