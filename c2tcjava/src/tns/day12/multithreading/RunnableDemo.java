package tns.day12.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		ChildThread2 t1 = new ChildThread2("Hello",5);  
		//t1.start(); // t1 is of runnable class so we have to wrap in thread class
		Thread t = new Thread(t1);
		t.start();
		
		
		ChildThread3 tt = new ChildThread3("Hel", 5);  

		
	}

}
