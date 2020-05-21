package day1;

public class StaticTest {

    static int a = 1;

    static {
        System.out.println("静态代码块初始化");
    }

    {
        System.out.println("代码块初始化");
    }

    public  void test() {
        System.out.println("静态方法test执行");
    }

    public StaticTest() {
        System.out.println("构造方法初始化");
    }

    public static StaticTest newInstance(){
        return new StaticTest();
    }
}
