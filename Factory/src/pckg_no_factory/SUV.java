package pckg_no_factory;

public class SUV extends Car{
	public SUV ( String brand , String model ) {
		super ( brand , model );
	}
	
	@Override
	protected Car produceCar ( ) {
		return null;
	}
	
	@Override
	public String toString ( ) {
		return "SUV{" +
		       "brand='" + brand + '\'' +
		       ", model='" + model + '\'' +
		       '}';
	}
}
