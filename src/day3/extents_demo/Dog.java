package day3.extents_demo;

/**
 * 狗类
 */
public class Dog extends Animal {

    public int age = 10;

    /**
     * 吃
     */
    public void eat() {
        System.out.println("吃一盆");
    }

    /**
     * 吠
     */
    public static void bark() {
        System.out.println("Dog 吠");
    }

    /**
     * 打印年龄¬
     */
    public void printAge() {
        System.out.println("age:" + age);
    }

    @Override
    public String getNickName() {
        return "狗";
    }
}
