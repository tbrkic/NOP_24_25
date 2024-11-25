package pckg_command_pattern.pckg_zad2;

public class DepositMoney implements PaymentInterface{
	private float oldBalance;
	private float amount;
	
	public DepositMoney (Account account, float amount ) {
		this.amount = amount;
		this.oldBalance =account.accountBalance;
	}
	@Override
	public void execute ( ) {
	oldBalance=amount+oldBalance;
	}
	
	@Override
	public void undo ( ) {
	oldBalance=-amount+oldBalance;
	}
	
	@Override
	public void redo ( ) {
	oldBalance=oldBalance+amount;
	}
	
	@Override
	public String toString ( ) {
		return "DepositMoney{" +
		       "oldBalance=" + oldBalance +
		       ", amount=" + amount +
		       '}';
	}
}
