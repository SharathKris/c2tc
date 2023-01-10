package tns.day12.multithreading;

public class ChildThread3 implements Runnable{

	private String msg;
	private int tim;
	Thread t;
	

	public ChildThread3(String msg, int tim) {
			this.msg = msg;
			this.tim=tim;
			t=new Thread(this);
			t.start();
		}

	@Override
	public void run() {
		for(int i=1; i<=tim; i++) {
			System.out.println(msg);
		}
	}
	

}
