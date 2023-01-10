package tns.day12.multithreading.sychronization;

public class AccountThread extends Thread{
	Account acc;
	int amt;
	int choice;
	public AccountThread(Account acc, int amt, int choice)
	{
		this.acc=acc;
		this.amt=amt;
		this.choice = choice;
		start();
	}
	
	@Override
	public void run()
	{
		synchronized(acc) {
			if(choice == 1 ) {
			try {
				acc.withdraw(amt);
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			}
			else {
			try {
				acc.deposit(amt);
			}
			catch(DepositLimitException e) {
				System.out.println(e.getMessage());
			}
			}
		}
		
		//acc.withdraw(amt);   // if using synchronized method
		
		

	}

}
