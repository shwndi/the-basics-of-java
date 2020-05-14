package array;


public class ArrayPrint {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "两只老虎";
        arr[1] = "一只老虎";
        arr[2] = "没有老虎";
        for (String s : arr) {
            System.out.print(s);
        }
    }
}
