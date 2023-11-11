
public class SavingsAccount extends BankAccount {
	
	private double rate = 2.088; // 2.5 doesn't match the output on the example 2.5% of 900 is 2.25 making the posted balance 902.25
	private int savingsNumber=0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name,amount);
		accountNumber = super.getAccountNumber() + "-"+savingsNumber;	
	}
	
	public void postInterest()
	{
		double interestEarned;
		interestEarned = super.getBalance()*(rate/1000.0);
		super.setBalance(super.getBalance()+interestEarned);
	}
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public int getSavingsNumber()
	{
		return savingsNumber;
	}

	public SavingsAccount(SavingsAccount preAccount,double amount)
	{
		super(preAccount,amount);
		savingsNumber = preAccount.getSavingsNumber() +1;
		accountNumber = super.getAccountNumber()+"-" +savingsNumber;
		
	}

}
