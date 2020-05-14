package Leetcode;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"", "flow", "flight"};
        String str = longestCommonPrefix(strs);
        System.out.println(str);
    }

    public static String longestCommonPrefix(String[] strs) {
        int num = strs.length;
        int j = 0;
        String str;
        //校验字符串合法性
        try {
            str = strs[0];
        } catch (Exception e) {
            return "";
        }
        //如果为零直接返回空
        if (str.length() == 0) {
            return "";
        }
        //取值循环比较
        for (; ; j++) {
            boolean flag = true;
            for (int i = 0; i < num && flag; i++) {
            	//没有取到字符就结束了
                try {
                    char code = str.charAt(j);
                    char chars = strs[i].charAt(j);
                    if (chars != code) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    flag = false;
                }

            }
            //判断是否结束循环
            if (!flag) {
                break;
            }
        }
        //取值返回
        return strs[0].substring(0, j);
    }

}
