package day3.extents_demo;

/**
 * 哈士奇
 */
public class Huskie extends Dog {

    public int age = 6;


    /**
     * 吃
     */
    public void eat() {
        System.out.println("吃十盆");
    }

    /**
     * 吠
     */
    public static void bark() {
        System.out.println("Huskie 吠");
    }

    @Override
    public String getNickName() {
        return "哈士奇";
    }
}
