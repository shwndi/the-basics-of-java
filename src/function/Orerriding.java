package function;

import javax.annotation.Resource;

/**
 * 方法覆盖
 *
 * @author czy
 * @date 2020/05/09
 */
public class Orerriding {
    public static void main(String[] args) {
        first first = new first(2, 3);
        System.out.println(first.area());
        Second second = new Second(4, 5);
        System.out.println(second.area());

    }

    static class first {
        int a;
        int b;

        first(int a, int b) {
            this.a = a;
            this.b = b;
        }

        Object area() {
            return "你猜";
        }
    }

    static class Second extends first {
        Second(int a, int b) {
            super(a, b);
        }

        @Override
        Integer area() {
            return a * b;
        }
    }
}
