package pckg_icecream;


public class IceCream {
	protected String name;
	protected double unitPrice;
	protected int amount;
	
	protected double calculatePrice ( ) {
		return 0;
	}
	
	public void description(){
		System.out.println (this.getClass ().getSimpleName ()+":" );
		System.out.println (this );
	}
	
	public IceCream ( String name , double unitPrice , int amount ) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	@Override
	public String toString ( ) {
		return "IceCream{" +
		       "name='" + name + '\'' +
		       ", price=" + unitPrice +
		       ", amount=" + amount +
		       '}';
	}
}
