package day3.deadlock;

/**
 * 死锁示例
 */
public class Demo {

    private static Object lockA = new Object();
    private static Object lockB = new Object();

    public static void main(String[] args) {
        PeopleA peopleA = new PeopleA();
        PeopleB peopleB = new PeopleB();
        peopleA.start();
        peopleB.start();
    }

    public static class PeopleA extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
                synchronized (lockA) {
                    System.out.println("持有🔐A");
                    pause();//sleep 50 ms
                    synchronized (lockB) {
                        System.out.println("持有🔐B");
                    }
                }
            }
        }
    }

    public static class PeopleB extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
                synchronized (lockB) {
                    System.out.println("持有🔐B");
                    pause();//sleep 50 ms
                    synchronized (lockA) {
                        System.out.println("持有🔐A");
                    }
                }
            }
        }
    }

    private static void pause() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
