package function;

/**
 * 枚举类和电闸选择
 */
public class EnumAndSwitch {

    enum Car{
        China,America,Japan,England,Genmany,Source_korea;

    }

    public static void main(String[] args) {
        Car car;
        car = Car.China;
        switch (car){
            case China:
                System.out.println("china");
                break;
            case Japan:
                System.out.println("japan");
                break;
            default:
                System.out.println("gun !");
        }

    }
}
