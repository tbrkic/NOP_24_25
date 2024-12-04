package pckg_icecream;

public class Test {
	public static void main ( String[] args ) {
		Chocolate ch1 = new Chocolate ( "chocolate",2.0,3 );
		ch1.calculatePrice ();
		ch1.description ();
		HoneyOverflow honeyOverflow=new HoneyOverflow ( "Honey Overflow" ,0.5,1,ch1);
		double finalPrice= honeyOverflow.decoratedPrice ();
		Hazelnut hazelnut = new Hazelnut ( "Hazelnut",0.5,1,honeyOverflow );
		finalPrice= hazelnut.decoratedPrice ( );
		System.out.println (finalPrice );
	}
}
