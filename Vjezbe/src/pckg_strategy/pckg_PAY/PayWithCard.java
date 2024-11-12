package pckg_strategy.pckg_PAY;

public class PayWithCard implements Pay{
	@Override
	public void completeTransaction ( ) {
		System.out.println ("Customer paid with card!!! omagah!" );
	}
}
