package ch16;

public class SynchronizedEx01 implements Runnable{

	public synchronized void a(String who){
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + " : b() ȣ��");
		b(who);
	}
	
	public synchronized void b(String who){
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + " : a() ȣ��");
		a(who);
	}
	
	@Override
	public void run() {
		b(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		SynchronizedEx01 s1 = 
				new SynchronizedEx01();
		Thread t1 = new Thread(s1,"ù��°");
		Thread t2 = new Thread(s1,"�ι�°");
		t1.start();
		t2.start();
	}
}