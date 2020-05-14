package function;

import java.util.ArrayList;
import java.util.List;

/**
 * Enum（枚举）构造函数及方法的使用
 *
 * @author czy
 * @date 2020/05/12
 */
public class EnumFunction {
    enum Car {
        China(1), America(2), Japan(3), England(4), Genmany(5), Source_korea(6);
        private int high;

        Car(int high) {
            this.high = high;
        }

        Integer getHigh() {
            return high;
        }

    }

    enum Huluwa {
        Dawa(180, 32, 45), Erwa(178, 33, 46), Sanwa(178, 31, 47), Siwa(185, 29, 47), Wuwa(182, 30, 47), Liuwa(180, 33, 48), Qiwa(179, 29, 45);
        private int weight;
        private int width;
        private int height;

        Huluwa(int weight, int width, int height) {
            this.weight = weight;
            this.width = width;
            this.height = height;
        }

        Integer getWeight() {
            return weight;
        }

        Integer getWidth() {
            return width;
        }

        Integer getHeight() {
            return height;
        }

        /**
         * 通过属性获取对象
         */
        static List<Huluwa> getObject(int weight) {
            List<Huluwa> huluwaList = new ArrayList();
            for (Huluwa huluwa : Huluwa.values()) {
                if (huluwa.weight == weight) {
                    huluwaList.add(huluwa);
                }
            }
            if (huluwaList.size()!=0) {
                return huluwaList;
            }
            throw new IllegalArgumentException(String.valueOf(weight));
        }
    }

    public static void main(String[] args) {
        List<Huluwa> huluwaObject = Huluwa.getObject(180);
        System.out.println(huluwaObject);
        System.out.println("国家高度：");
        for (Car car : Car.values()) {
            System.out.println(car + "有" + car.getHigh() + "米高。");
        }
    }
}
