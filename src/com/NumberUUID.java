package com;

import java.util.UUID;
/**
 * ��ȡ��������UUID
 * @author czy
 *
 */
public class NumberUUID {
	
	/*
	 * public static String getUUID(){ return
	 * UUID.randomUUID().toString().replace("-",""); }
	 */
    public static Integer getUUIDInOrderId(){
        Integer orderId=UUID.randomUUID().toString().hashCode();
        orderId = orderId < 0 ? -orderId : orderId; //String.hashCode() ֵ��Ϊ��
        return orderId;
    }

    public static void main(String[] args){
        for (int i = 0; i<100; i++)
        System.out.println(NumberUUID.getUUIDInOrderId());
    }
}
