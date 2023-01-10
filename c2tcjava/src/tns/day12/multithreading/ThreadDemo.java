package tns.day12.multithreading;

public class ThreadDemo {
	public static void main(String args[]) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		
		ChildThread1 t1 = new ChildThread1("Thread1");
		
		for(int i=1; i<20; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100);		 //current thread pauses after printing 1 and the child thread starts
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
//		for(int i=1; i<20; i++) {
//			System.out.print(i+ "\t" + Thread.currentThread().getName());
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("________________________________");
	}
}
