package com;

import java.util.UUID;
/**
 * 获取数字类型UUID
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
        orderId = orderId < 0 ? -orderId : orderId; //String.hashCode() 值会为空
        return orderId;
    }

    public static void main(String[] args){
        for (int i = 0; i<100; i++)
        System.out.println(NumberUUID.getUUIDInOrderId());
    }
}
