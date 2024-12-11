package pckg_newerpckg;

public class SimpleCarCreator {
	public static Car produceCar ( String brand, String model, String type ){
		 switch ( type ){
			case "EU_SUV":return new EU_SUV ( brand, model );
			case "EU_Sedan":return new EU_Sedan ( brand, model );
			default:throw new IllegalArgumentException ( "Not a defined type of car!" );
		}
	}
}
