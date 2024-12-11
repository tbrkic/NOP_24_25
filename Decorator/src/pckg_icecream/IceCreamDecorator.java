package pckg_icecream;

public class IceCreamDecorator extends IceCream {
	IceCream component;
	public IceCreamDecorator ( String name , double unitPrice , int amount, IceCream component ) {
		super ( name , unitPrice , amount );
		this.component=component;
	}
	
	protected double decoratedPrice ( ) {
		return 0;
	}
	
	@Override
	protected double calculatePrice ( ) {
	double price = this.component.calculatePrice ()+unitPrice*amount;
		return price;
	}
}
