package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public static void main(String[] args) {
        String str = "D";
        int result = romanToInt(str);
        System.out.println(result);
    }
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        if(s.length()==0){
            return  0 ;
        }
        int a = map.get(s.charAt(0)+"");
        int num = a ;
        for(int i = 1; i < s.length(); i++){
            int b = map.get(s.charAt(i)+"");
            if(a>=b){
                num+=a;
            }else{
                num-=a;
            }
            a = b;
            if (i==s.length()-1)
                num+=b;
        }
        return num;
    }
}
