package tns.day12.multithreading;

public class ChildThread1 extends Thread {

	public ChildThread1(String name) {
		super();
		start();
		setName(name);

	}
	
	@Override
	public void run() {
		char ch1;
		int i;
		for( i=1, ch1='A';i<=26;i++,ch1++) {
			System.out.println(ch1+"  " +currentThread().getName());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} 
