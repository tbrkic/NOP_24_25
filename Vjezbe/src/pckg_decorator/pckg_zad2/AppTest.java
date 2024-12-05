package pckg_decorator.pckg_zad2;

public class AppTest {
	public static void main ( String[] args ) {
		BasicCar basicCar = new BasicCar ();
		CarColour carColour = new CarColour ( "Green", basicCar );
		CarCover carCover = new CarCover ( basicCar );
		ExtraCarEquipment extraCarEquipment = new ExtraCarEquipment ( true,basicCar );
		System.out.println (basicCar );
	}
}
