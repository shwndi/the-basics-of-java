package com;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GetMD5 {
	public static void main(String [] args) {
		String a = "asdfj;ajif;a";
		System.out.printf(GetMD5.getMd5(a));
	}
	public static String getMd5(String content) {
        // 获取信息摘要 - 参数字典排序后字符串
        try {
            // 指定sha1算法
            MessageDigest digest = MessageDigest.getInstance("MD5");//sun.security.provider.·@74c6fd6e //sun.security.provider.MD2@4e2c390c
            digest.update(content.getBytes("UTF-8"));
            // 获取字节数组
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
