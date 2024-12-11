package pckg_icecream;

public class Vanilla extends IceCream {
	public Vanilla ( String name , double unitPrice , int amount ) {
		super ( name , unitPrice , amount );
	}
	@Override
	protected double calculatePrice ( ) {
		return this.amount*this.unitPrice;
	}
}
