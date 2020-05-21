package day3.producer;

/**
 * 消费者类
 */
public class Consumer implements Runnable {

    private ProductBuffer buffer;

    public Consumer(ProductBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.pop();
        }
    }
}
