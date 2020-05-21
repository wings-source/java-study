package day3.extents_demo;

/**
 * 动物抽象类
 */
public abstract class Animal {

    /**
     * @return 动物的昵称
     */
    public abstract String getNickName();

    @Override
    public String toString() {
        return "昵称:" + getNickName();
    }
}
