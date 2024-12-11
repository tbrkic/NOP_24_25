package pckg_no_factory;

public class NewCarStore {
	private Car car;
	public NewCarStore ( ) {
		System.out.println ("New car store created!" );
	}
	public void orderCar(String brand, String model, String type){
	car=	SimpleCarCreator.produceCar ( brand, model, type );
		System.out.println ("Produced new car: "+car );
	}
}
