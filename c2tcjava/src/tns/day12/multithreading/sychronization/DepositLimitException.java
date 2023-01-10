package tns.day12.multithreading.sychronization;

public class DepositLimitException extends Exception{
	public DepositLimitException()
	{
		super("Deposit Limit exceded");
	}
	
	public DepositLimitException(String message)
	{
		super(message);
	}
}
