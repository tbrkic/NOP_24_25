package pckg_command_pattern.pckg_zad2;

public class CheckingAccount extends Account{
	private Account account;
	public CheckingAccount (String name, float number ) {
		super (name);
		super.accountBalance=number;
	}
	public void setAmount(float amount){
		account.amount=amount;
	}
public float getAmount(float amount){
	amount= account.amount;
	return amount;
}
	@Override
	public String toString ( ) {
		return "CheckingAccount{" +
		       "name='" + name + '\'' +
		       ", ID=" + ID +
		       ", accountBalance=" + accountBalance +
		       ", amount=" + amount +
		       '}';
	}
}
