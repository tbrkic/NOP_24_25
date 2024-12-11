package pckg_newpckg;

public class CarStoreEU_UK {
	
	public void orderEUCar(String brand, String model, String type){
		Car car=null;
		try{
			car=SimpleCarCreator.produceCar ( brand, model, type );
			System.out.println ("Produced new car: "+car+" for EU market!" );
		}catch ( IllegalArgumentException illegalArgumentException ){
			System.out.println (illegalArgumentException.getMessage () );
		}
	}
	
	public void orderUKCar ( String brand , String model , String type ) {
		Car car = null;
		try {
			car = SimpleCarCreator.produceCar ( brand , model , type );
			System.out.println ( "Produced new car: " + car + " for UK market!" );
		}
		catch ( IllegalArgumentException illegalArgumentException ) {
			System.out.println ( illegalArgumentException.getMessage ( ) );
		}
	}
}
