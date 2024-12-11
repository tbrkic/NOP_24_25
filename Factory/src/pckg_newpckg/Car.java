package pckg_newpckg;

public abstract class Car {
	protected String brand;
	protected String model;
	
	public Car ( String brand , String model ) {
		this.brand = brand;
		this.model = model;
	}
	protected abstract Car produceCar();
}
