package pckg_decorator.pckg_zad2;

public class ExtraCarInsurance extends Car{
	boolean hasInsurance;
	
	public ExtraCarInsurance ( boolean hasInsurance, Car car ) {
		this.hasInsurance = hasInsurance;
		if(hasInsurance){
		car.price+=1000;
		}
		this.price=car.price;
	}
	
	@Override
	public String toString ( ) {
		return "ExtraCarInsurance{" +
		       "hasInsurance=" + hasInsurance +
		       ", price=" + price +
		       '}';
	}
}
