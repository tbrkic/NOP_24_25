package pckg_newerpckg;

public class EUCarStore extends CarStore{
	public EUCarStore ( String carStoreName ) {
		super ( carStoreName );
	}
	
	@Override
	protected Car orderCar ( String brand , String model , String type ) {
		Car car = null;
		try {
			car = SimpleCarCreator.produceCar ( brand , model , type );
			System.out.println ( "Produced new car: " + car + " for EU market!" );
		}
		catch ( IllegalArgumentException illegalArgumentException ) {
			System.out.println ( illegalArgumentException.getMessage ( ) );
		}
	  return car;
	}
}
