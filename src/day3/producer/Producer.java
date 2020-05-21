package day3.producer;

/**
 * 生产者类
 */
public class Producer implements Runnable {

    private ProductBuffer buffer;

    public Producer(ProductBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.put();
        }

//        for (int i = 0; i < 999; i++) {
//            buffer.put();
//        }
    }
}
