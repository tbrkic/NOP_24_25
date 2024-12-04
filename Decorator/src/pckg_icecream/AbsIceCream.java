package pckg_icecream;


public abstract class AbsIceCream {
	protected String name;
	protected double unitPrice;
	protected int amount;
	protected abstract double calculatePrice();
	public void description(){
		System.out.println (this.getClass ().getSimpleName ()+":" );
		System.out.println (this );
	}
	
	public AbsIceCream ( String name , double unitPrice , int amount ) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	@Override
	public String toString ( ) {
		return "AbsIceCream{" +
		       "name='" + name + '\'' +
		       ", price=" + unitPrice +
		       ", amount=" + amount +
		       '}';
	}
}
