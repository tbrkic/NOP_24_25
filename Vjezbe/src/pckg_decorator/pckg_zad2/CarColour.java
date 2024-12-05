package pckg_decorator.pckg_zad2;

public class CarColour extends Car{
	String colour;
	
	public CarColour ( String colour, Car car ) {
		this.colour = colour;
		car.price+=150;
		this.price = car.price;
	}
	
	@Override
	public String toString ( ) {
		return "CarColour{" +
		       "colour='" + colour + '\'' +
		       ", price=" + price +
		       '}';
	}
}
