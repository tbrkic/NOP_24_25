package pckg_no_factory;

public class SimpleCarCreator {
	public static Car produceCar(String brand, String model, String type){
		 switch ( type ){
			case "EU_SUV":return new SUV(brand, model );
			case "EU_Sedan":return new Sedan ( brand, model );
			default:throw new IllegalArgumentException ( "Not a defined type of car!" );
		}
	}
}
