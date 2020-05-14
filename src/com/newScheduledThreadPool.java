package com;


import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class newScheduledThreadPool {
	public static void main(String[] args ) {
		ScheduledExecutorService scheduledThreadPool=Executors.newScheduledThreadPool(3);
		System.out.println(new Date().getSeconds());
//		scheduledThreadPool.scheduleAtFixedRate(new Runnable(){
		scheduledThreadPool.scheduleWithFixedDelay(new Runnable(){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"***"+new Date().getSeconds()+"===== I love LSR");
			}
		},1,3,TimeUnit.SECONDS);

	}

}
