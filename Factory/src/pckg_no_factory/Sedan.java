package pckg_no_factory;

public class Sedan  extends Car{
	public Sedan ( String brand , String model ) {
		super ( brand , model );
	}
	
	@Override
	protected Car produceCar ( ) {
		return null;
	}
	
	@Override
	public String toString ( ) {
		return "Sedan{" +
		       "brand='" + brand + '\'' +
		       ", model='" + model + '\'' +
		       '}';
	}
}
