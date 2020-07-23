package Lesson3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new Thread(new Runnable() {
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
});
	t1.start();
	}

}
