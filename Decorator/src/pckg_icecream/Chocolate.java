package pckg_icecream;

public class Chocolate extends IceCream {
	public Chocolate ( String name , double unitPrice , int amount ) {
		super ( name , unitPrice , amount );
	}
	
	@Override
	protected double calculatePrice ( ) {
	double price=unitPrice*amount;
		return price;
	}
}
