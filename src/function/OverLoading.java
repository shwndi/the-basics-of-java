package function;

/**
 * 方法重载：
 * 方法名称相同
 *
 * @author czy
 * @date 2020/04/29
 */
public class OverLoading {
    /**
     * 长
     */
    private int length;
    /**
     * 宽
     */
    private int width;
    /**
     * 高
     */
    private int height;

    /**
     * constructor:构造方法
     * 特点：(记得赋值呦)
     * 1.构造方法的名字必须与定义他的类名完全相同，没有返回类型，甚至连void也没有。
     * 2.构造方法的调用是在创建一个对象时使用new操作进行的。构造方法的作用是初始化对象。
     * 3.每个类可以有零个或多个构造方法.
     * 4.不能被static、final、synchronized、abstract和native修饰。构造方法不能被子类继承。
     * 5.构造方法在创建对象时自动执行,一般不能显式地直接调用.
     * 6.构造方法可以被重载。
     * 7.没有参数的构造方法称为默认构造方法，与一般的方法一样，构造方法可以进行任何活动，但是经常将他设计为进行各种初始化活动，比如初始化对象的属性。
     */
    OverLoading() {
        System.out.println("无参构造");
        length = 1;
        width = 2;
        height = 3;
    }

    /**
     * 构造方法重载
     *
     * @param length
     */
    OverLoading(int length, int width, int height) {
        System.out.println("length" + length + "\t" + "width:" + width + "\t" + "height" + height);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void operation() {
        System.out.println(length + "\t" + width + "\t" + height);
    }

    void operation(int a) {
        System.out.println("volume:" + length * width * height);
    }

    public static void main(String[] args) {
        OverLoading loading1 = new OverLoading();
        OverLoading loading2 = new OverLoading(4, 5, 6);
        loading1.operation();
        loading2.operation(1);
    }
}
