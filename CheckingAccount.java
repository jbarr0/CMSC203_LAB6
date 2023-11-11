
public class CheckingAccount extends BankAccount {
	static final double FEE =.15;
	
	
	public CheckingAccount(String owner, double balance)
	{
		super(owner,balance);
		setAccountNumber(getAccountNumber()+"-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		if(super.withdraw(amount+FEE))
		{
			return true;
		}
		return false;
	}

	

}
