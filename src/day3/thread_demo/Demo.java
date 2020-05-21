package day3.thread_demo;

public class Demo {
    public static void main(String[] args) {

        Data data = new Data();

        Thread threadA = new ShareThreadA(data);
        Thread threadB = new ShareThreadB(data);

        threadA.start();
        threadB.start();
    }

    public static class ShareThreadA extends Thread {
        private Data data;

        public ShareThreadA(Data data) {
            this(data, null);
        }

        public ShareThreadA(Data data, Runnable target) {
            super(target);
            this.data = data;
        }

        @Override
        public void run() {
            super.run();
            while (true) {
                data.add();
                System.out.println("当前线程:" + Thread.currentThread().getName() + "," + data);
            }
        }
    }

    public static class ShareThreadB extends Thread {
        private Data data;

        public ShareThreadB(Data data) {
            this(data, null);
        }

        public ShareThreadB(Data data, Runnable target) {
            super(target);
            this.data = data;
        }

        @Override
        public void run() {
            super.run();
            while (true) {
                data.reduce();
                System.out.println("当前线程:" + Thread.currentThread().getName() + "," + data);
            }
        }
    }


    public static class Data {
        private int count;

        public void add() {
            ++count;
        }

        public void reduce() {
            --count;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "count=" + count +
                    '}';
        }
    }

}
