package com;
/**
 * �ַ�����ȡ
 * @author czy
 *
 */
public class SubString {
	    public static void main(String[] args) {
	        String str ="232ljsfsf.sdfl23.ljsdfsdfsdfss.23423.sdfsdfsfd";
	        //��õ�һ�����λ��
	        String a = str.substring(0,3);
	        System.out.println(a);
	        int index=str.indexOf(".");
	        System.out.println(index);
	        //���ݵ�һ�����λ�� ��õڶ������λ��
	        index=str.indexOf(".", index+1);
	        System.out.println(index);
	        //���ݵڶ������λ�ã���ȡ �ַ������õ���� result
	        String result=str.substring(index);
	        //������
	        System.out.println(result);
	    }

}
