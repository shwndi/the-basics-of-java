package com;

import java.lang.reflect.AnnotatedType;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

//import java.util.*;

public class Property {
	public static void main(String [] args) {
//		new ArrayList()
//		System.out.println(new Date());		
//		Properties p=System.getProperties();
//		p.list(System.out);
//		System.out.println("--- Memory Usage:");
//		Runtime rt = Runtime.getRuntime();
//		System.out.println("Total Memory = "
//		                    + rt.totalMemory()
//		                    + " Free Memory = "
//		                    + rt.freeMemory());
//		System.gc();
//		//Shift + Alt +L: Ãû×Ö×ÔÉú
//		HashMap hashMap = new HashMap();
		try {
			Class Name = Class.forName("com.ExportDmp");
			System.out.println(Name);
			AnnotatedType[] annotatedInterfaces = Name.getAnnotatedInterfaces();
			String a = annotatedInterfaces.toString();
			System.out.print(a);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
//	try {
//		Thread.currentThread().sleep(5 * 1000);
//		} catch(InterruptedException e) {}
//		}

}
