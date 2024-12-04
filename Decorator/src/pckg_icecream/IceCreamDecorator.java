package pckg_icecream;

public abstract class IceCreamDecorator extends AbsIceCream{
	AbsIceCream component;
	public IceCreamDecorator ( String name , double unitPrice , int amount, AbsIceCream component ) {
		super ( name , unitPrice , amount );
		this.component=component;
	}
protected abstract double decoratedPrice();
	@Override
	protected double calculatePrice ( ) {
	double price = this.component.calculatePrice ()+unitPrice*amount;
		return price;
	}
}
