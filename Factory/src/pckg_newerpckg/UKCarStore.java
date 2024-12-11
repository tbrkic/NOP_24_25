package pckg_newerpckg;

public class UKCarStore extends CarStore{
	public UKCarStore ( String carStoreName ) {
		super ( carStoreName );
	}
	
	@Override
	protected Car orderCar ( String brand , String model , String type ) {
		
		Car car = null;
		try {
			car = SimpleCarCreator.produceCar ( brand , model , type );
			System.out.println ( "Produced new car: " + car + " for UK market!" );
		}
		catch ( IllegalArgumentException illegalArgumentException ) {
			System.out.println ( illegalArgumentException.getMessage ( ) );
		}  return car;
	}
	}
