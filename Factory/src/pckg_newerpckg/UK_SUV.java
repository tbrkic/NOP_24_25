package pckg_newerpckg;

public class UK_SUV extends Car {
	public UK_SUV ( String brand , String model ) {
		super ( brand , model );
	}
	
	@Override
	protected Car produceCar ( ) {
		return null;
	}
	
	@Override
	public String toString ( ) {
		return "EU_SUV{" +
		       "brand='" + brand + '\'' +
		       ", model='" + model + '\'' +
		       '}';
	}
}
