package tns.day12.multithreading.sychronization;

public class Account implements Bank{
	private int accNo;
	private String Name;
	private double balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		Name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", balance=" + balance + "]";
	}
	
	@Override
	public void deposit(int amt) throws DepositLimitException {
		if (amt>DAILY_LIMIT) {
			throw new DepositLimitException();
		}
		else {
			balance = balance + amt;
		  System.out.println("After depositing "+amt+", Balance :" +balance);
		}
		}
	
	//Synchronized Method
	@Override
	/*
	 * public synchronized void withdraw(int amt) { balance = balance - amt;
	 * System.out.println("Balance :" +balance); }
	 */
	
	public void withdraw(int amt) throws InsufficientBalanceException {
		
		
			if(balance-amt<MINBAL) 
				throw new InsufficientBalanceException();
			else {
				balance = balance - amt;
				System.out.println("After withdrawing "+amt+", Balance :" +balance); 
			}
		}
}
