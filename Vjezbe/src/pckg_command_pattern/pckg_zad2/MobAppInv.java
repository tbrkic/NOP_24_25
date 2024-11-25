package pckg_command_pattern.pckg_zad2;

public class MobAppInv implements PaymentInterface{
	public MobAppInv ( ) {
	}
	void performTransaction(PaymentInterface pi){
		pi.execute ();
	}
	
	@Override
	public void execute ( ) {
	
	}
	
	@Override
	public void undo ( ) {
	
	}
	
	@Override
	public void redo ( ) {
	
	}
}
