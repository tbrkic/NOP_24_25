package pckg_command_pattern.pckg_zad2;

public class ForeignCurrencyAccount extends Account implements PaymentInterface{
	public ForeignCurrencyAccount ( String name ) {
		super ( name );
		super.accountBalance=100;
	}
	
	@Override
	public void execute ( ) {
	super.accountBalance+= ( float ) ( amount * 7.5345);
	}
	
	@Override
	public void undo ( ) {
		super.accountBalance-= ( float ) ( amount * 7.5345);
	}
	
	@Override
	public void redo ( ) {
		super.accountBalance += ( float ) ( amount * 7.5345 );
	
	}
}
