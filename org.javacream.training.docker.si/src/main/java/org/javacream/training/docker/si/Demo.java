package org.javacream.training.docker.si;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo {
	public static void main(String[] args) throws Exception{
		System.out.println(new Demo().doSomething());
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
		executorService.scheduleAtFixedRate(()-> {System.out.println("Executing at " + new Date());System.gc();} , 0, 5, TimeUnit.SECONDS);
	}

	public String doSomething() {
		return "OK";
	}
}
