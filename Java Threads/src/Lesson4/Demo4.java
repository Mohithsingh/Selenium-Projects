package Lesson4;

public class Demo4 {
public static int count=0;
public static synchronized void intcount() {//synchronized calls lock to make access of count variable one by one thread
	count++;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new Thread(new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100000;i++) {
			intcount();
		}
	}
	});
	Thread t2=new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<=100000;i++) {
				intcount();
			}
		}
	});
	t1.start();
	t2.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//join used to make pause the currrent thread execution untik unless the specified thread is dead
	try {
		t2.join();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	System.out.println("Value :"+count);
	}
}