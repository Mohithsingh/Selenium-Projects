package Lesson2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class myclass implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getId()+"Value"+i);
	}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new myclass());
		Thread t2=new Thread(new myclass());
		t1.start();
		t2.start();
	}

}
