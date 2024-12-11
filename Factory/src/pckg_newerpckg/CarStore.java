package pckg_newerpckg;

public abstract class CarStore {
	protected String carStoreName;
	
	public CarStore ( String carStoreName ) {
		this.carStoreName = carStoreName;
	}
	
	/**
	 *
	 * @param brand
	 * @param model
	 * @param type
	 * @return
	 * @throws IllegalArgumentException
	 */
	protected abstract Car orderCar ( String brand, String model, String type ) throws IllegalArgumentException;
}
