package pckg_newpckg;

public class UK_Sedan extends Car {
	public UK_Sedan ( String brand , String model ) {
		super ( brand , model );
	}
	
	@Override
	protected Car produceCar ( ) {
		return null;
	}
	
	@Override
	public String toString ( ) {
		return "EU_Sedan{" +
		       "brand='" + brand + '\'' +
		       ", model='" + model + '\'' +
		       '}';
	}
}
