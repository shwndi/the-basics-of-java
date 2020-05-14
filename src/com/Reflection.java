package com;

import static java.lang.Class.forName;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * reflection is commonly used by programs which require 
 * the ability to examine or modify the runtime behavior of application
 * running in the Java virtual machine.This is a relatively advanced feature and should
 * be used in the java virtual machine . This is a relatively advanced feature and should be used 
 * only by developers who have a strong grasp of the fundamentals of the language .with  that caveat in mind ,
 * reflection is a powerful technique and can enable applications to perform
 * operations which would otherwise be impossible.
 * @author czy
 * @data  
 */
public class Reflection {
	private static void main (String[] args) throws Exception {
		 Class clazz = Class.forName("reflection.Student");
		 Method method = clazz.getMethod("doHomework", String.class);
		 Constructor constructor = clazz.getConstructor();
		 Object object = constructor.newInstance();
		 method.invoke(object, "ÓïÎÄ");
		
	}

}
