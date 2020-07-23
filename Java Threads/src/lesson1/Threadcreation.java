package lesson1;
class Myclass extends Thread{

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

public class Threadcreation {

	public static void main(String[] args) {
		Myclass myclass=new Myclass();
		myclass.start();
		Myclass myclass1sss=new Myclass();
		myclass1sss.start();
	}

}
