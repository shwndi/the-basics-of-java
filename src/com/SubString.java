package com;
/**
 * 字符串截取
 * @author czy
 *
 */
public class SubString {
	    public static void main(String[] args) {
	        String str ="232ljsfsf.sdfl23.ljsdfsdfsdfss.23423.sdfsdfsfd";
	        //获得第一个点的位置
	        String a = str.substring(0,3);
	        System.out.println(a);
	        int index=str.indexOf(".");
	        System.out.println(index);
	        //根据第一个点的位置 获得第二个点的位置
	        index=str.indexOf(".", index+1);
	        System.out.println(index);
	        //根据第二个点的位置，截取 字符串。得到结果 result
	        String result=str.substring(index);
	        //输出结果
	        System.out.println(result);
	    }

}
