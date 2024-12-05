package pckg_decorator.pckg_zad2;

public class ExtraCarEquipment extends Car{
	boolean comesWithExtraEquipment;
	
	public ExtraCarEquipment ( boolean comesWithExtraEquipment, Car car ) {
		this.comesWithExtraEquipment = comesWithExtraEquipment;
		if(comesWithExtraEquipment){
			car.price+=200;
		}
		this.price = car.price;
	}
	
	@Override
	public String toString ( ) {
		return "ExtraCarEquipment{" +
		       "comesWithExtraEquipment=" + comesWithExtraEquipment +
		       ", price=" + price +
		       '}';
	}
}
