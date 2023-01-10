package tns.day12.multithreading.sychronization;

import java.util.Scanner;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Account a1 = new Account(101, "Amit and Amon", 500000 );
		System.out.println(a1);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Deposit :2 and Withdrawal :1");
		int choice = sc.nextInt();
		
		/* 
		AccountThread t1 = new AccountThread(a1, 20000);
		AccountThread t2 = new AccountThread(a1, 50000);
		*/
		AccountThread t[] = new AccountThread[10];
		for(int i=0; i<10; i++) {
			t[i]= new AccountThread(a1, 10000*(i+1), choice);
		}
		
		try {
			for(int i=0; i<10; i++) {
				t[i].join();
			}
			/*t1.join();   //main thread will wait and execute after execution of t1
			t2.join();
			*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println(a1);
		
		sc.close();
	}

}

