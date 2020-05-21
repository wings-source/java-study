package day3.extents_demo;

public class Demo {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Huskie dog2 = new Huskie();

        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("---------");

        //子类覆盖父类非静态方法
        dog1.eat();
        dog2.eat();

        System.out.println("---------");

        //非静态成员变量
        System.out.println("age:" + dog1.age);
        System.out.println("age:" + dog2.age);

        System.out.println("---------");

        //子类覆盖父类静态方法
        dog1.bark();
        dog2.bark();
    }
}
