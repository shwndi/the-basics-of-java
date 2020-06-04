package myException;

/**
 * 方法重载异常
 */
public class OverLoadException {
    public static void main(String[] args) {
        OverLoadException e = new OverLoadException();
        try{
            System.out.println(method(10, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(10.0, 20.0));
            System.out.println(e.method(10));
        }
        catch (Exception ex){
            System.out.println("exception occoure: "+ ex);
        }
    }
    double method(int i) throws Exception{
        return i/0;
    }
    boolean method(boolean b) {
        return !b;
    }
    static double method(int x, double y) throws Exception  {
        return x + y ;
    }
    static double method(double x, double y) {
        return x + y - 3;
    }
}
