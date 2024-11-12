package pckg_strategy.pckg_PAY;

public class PayWithPayPal implements Pay{
	@Override
	public void completeTransaction ( ) {
		System.out.println ("Customer paid with PayPal!!!!!!!!!!!!!!!!!!!!! This guy really knows about online safety!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );
	}
}
