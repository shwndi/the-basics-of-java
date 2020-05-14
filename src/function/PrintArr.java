package function;

/**
 * 数组输出
 * @author czy
 * @date 2020/04/29
 */
public class PrintArr {
    public static void main(String[] args) {
        String[] a = {"asdaf","asdfa","dfa"};
        Print print = new Print(a);
        Integer[] b={1,2,3,4};
        print.info(b);
    }
}
 class Print{
   /* *//**
     * char[]
     *//*
    Print(char[] ch){
        System.out.print("数组元素为：[");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+",");
        }
        System.out.println("]");
    }
    *//**
     * int[]
     *//*
    Print(int[] ch){
        System.out.print("数组元素为：[");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+",");
        }
        System.out.println("]");
    }
    *//**
     * String[]
     *//*
    Print(String[] ch){
        System.out.print("数组元素为：[");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+",");
        }
        System.out.println("]");
    }*/
    /**
     * char[]
     */
    Print(Object[] ch){
        System.out.print("数组元素为：[");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+",");
        }
        System.out.println("]");
    }
    void info(){
        System.out.println("输入为空");
    }
    void info(Object[] ch){
        System.out.print("数组元素为：[");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+",");
        }
        System.out.println("]");
    }
}
