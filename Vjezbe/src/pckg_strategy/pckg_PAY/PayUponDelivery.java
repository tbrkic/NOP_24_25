package pckg_strategy.pckg_PAY;

public class PayUponDelivery implements Pay{
	@Override
	public void completeTransaction ( ) {
		System.out.println ("Customer paid with cash upon delivery!!!(wish that worked for AliExpress orders)" );
	}
}
