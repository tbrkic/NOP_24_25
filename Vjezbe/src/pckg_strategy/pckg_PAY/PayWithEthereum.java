package pckg_strategy.pckg_PAY;

public class PayWithEthereum implements Pay{
	@Override
	public void completeTransaction ( ) {
		System.out.println ("Customer paid with Ethereum!!!!!!!!!!!!!! They must mine with their PC!!! Surely, that's the case! I sure hope so, because that thing they ordered looks expensive, like at least 5 Xbox Series X 2TB editions." );
	}
}
