package day3.producer;

/**
 * 产品缓冲类
 */
public class ProductBuffer {

    /**
     * 最大数量限制
     */
    public static final int MAX_LENGTH = 100;
    private int size;

    public void put() {
//        synchronized (this) {
            if (size < MAX_LENGTH) {
                System.out.println("生产前size:" + size);
                size += 1;
                System.out.println("生产产品,当前产品数量:" + size);
//                notify();
            } else {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
//        }
    }

    public void pop() {
//        synchronized (this) {
            if (size > 0) {
                System.out.println("消费前size:" + size);
                size -= 1;
                System.out.println("消费产品,当前产品数量:" + size);
//                notifyAll();
            } else {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
//        }
    }

    public int size() {
        return size;
    }
}
