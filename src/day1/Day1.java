package day1;

import java.util.LinkedHashSet;

public class Day1 {
    public int a;
    public static boolean bool;

    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static final double PI = 3.14;


    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        test.test();
        StaticTest staticTest = StaticTest.newInstance();
    }


    /**
     * 数据类型默认值
     */
    protected static void printDefaultValue() {
        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);
    }

    /**
     * 打印基础数据类型
     */
    public static void printBaseDataType() {
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }

    /**
     * 自动类型转换
     */
    public static void autoTypeTransform() {
        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2 + 1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
    }

    /**
     * 强制数据类型转换
     */
    public static void forceTypeTransform() {
        int i1 = 123;
        int i2 = 555;
        byte b1 = (byte) i1;//强制类型转换为byte
        byte b2 = (byte) i2;//强制类型转换为byte

        System.out.println("int强制类型转换为byte后的b1值等于" + b1);
        System.out.println("int强制类型转换为byte后的b2值等于" + b2);
    }

//    /**
//     * 静态代码块和代码块执行顺序
//     */
//    public static void staticTest() {
//        StaticTest staticTest = new StaticTest();
//        StaticTest.test();
//    }
}
