package pckg_newerpckg;

import java.util.ArrayList;

public class CarStoreApp {
	private CarStore carStore;
	private final ArrayList<Car> orderedCars;
	
	public CarStoreApp ( CarStore carStore , ArrayList < Car > orderedCars ) {
		this.carStore = carStore;
		this.orderedCars = new ArrayList<> ();
	}
	public Car orderSomeCar(String brand, String model, String type) throws NullPointerException{
		Car car=null;
		try{
		car=carStore.orderCar ( brand, model, type );
		return car; }
		catch ( IllegalArgumentException e ) {
			System.out.println (e.fillInStackTrace () );
		} return car;
	}
}
