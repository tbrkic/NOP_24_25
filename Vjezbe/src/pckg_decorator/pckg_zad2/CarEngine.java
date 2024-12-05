package pckg_decorator.pckg_zad2;

public class CarEngine extends Car{
	String engineType;
	
	public CarEngine ( String engineType, Car car ) {
		this.engineType = engineType;
		if(engineType=="Diesel"){
			car.price+=200;
		}else if(engineType=="Gasoline"){
			car.price-=50;
		}
		this.price = car.price;
	}
	
	@Override
	public String toString ( ) {
		return "CarEngine{" +
		       "engineType='" + engineType + '\'' +
		       ", price=" + price +
		       '}';
	}
}
