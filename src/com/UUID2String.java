package com;

import java.util.UUID;
/**
 * ��ȡ�ַ���UUID
 * @author czy
 *
 */
public class UUID2String {
	public static void main(String [] args) {
		System.out.println( UUID.randomUUID().toString().replace("-", ""));
	}
}
