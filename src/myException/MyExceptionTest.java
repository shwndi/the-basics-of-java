package myException;

import sun.applet.Main;

/**
 * 异常需要封装和传递，
 * 在进行系统开发的时候，不要“吞噬”异常，也不要“赤裸裸”的抛出异常，
 * 封装后在抛出，或者通过异常链传递，可以达到系统更健壮、友好的目的。
 * 测试
 */
public class MyExceptionTest {
    public static void main(String[] args) {
        MyExceptionTest m =new MyExceptionTest();
        try{
            m.test1();
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();//获得原始异常
            System.out.println(e.getCause());
        }
    }
    public  void test1() throws RuntimeException{
        String[] sexs = {"男性","女性","中性"};
        for(int i = 0; i < sexs.length; i++){
            if("中性".equals(sexs[i])){
                try {
                    throw new MyException("不存在中性的人！");
                } catch (MyException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    RuntimeException rte=new RuntimeException(e);//包装成RuntimeException异常
                    //rte.initCause(e);
                    throw rte;//抛出包装后的新的异常
                }
            }else{
                System.out.println(sexs[i]);
            }
        }
    }
}
