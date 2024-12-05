package pckg_decorator.pckg_zad2;

public class CarCover extends Car{
	public CarCover (Car car) {
		car.price+=30;
		this.price=car.price;
	}
	@Override
	public String toString ( ) {
		return "CarCover{" +
		       "priceWithCover=" + price +
		       '}';
	}
}
