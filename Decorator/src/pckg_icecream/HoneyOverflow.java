package pckg_icecream;

public class HoneyOverflow extends IceCreamDecorator{
	
	public HoneyOverflow ( String name , double unitPrice , int amount , IceCream component ) {
		super ( name , unitPrice , amount , component );
	}
	
	@Override
	protected double decoratedPrice ( ) {
	double price =unitPrice*amount+this.component.calculatePrice ();
		System.out.println (this.getClass ().getSimpleName ()+" decorates: "+this.component.getClass ().getSimpleName () );
		return price;
	}
	
	@Override
	public String toString ( ) {
		return "HoneyOverflow{" +
		       "name='" + name + '\'' +
		       ", unitPrice=" + unitPrice +
		       ", amount=" + amount +" decorates: "+this.component+
		       '}';
	}
}
