public class Return {
    public static void main(String[] args) {
        int a= getRet();
        System.out.println(a);
    }

    public static int getRet() {
        for (int i = 0; i < 11; i++) {
            if (i==2){
                return 2;
            }
            System.out.println(i);
        }
        return 10;
    }
}
