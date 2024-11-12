package pckg_adapters_and_facades.pckg_zad4;

public class App {
	public static void main ( String[] args ) {
		AirCondSystemFacade airCondSystemFacade=new AirCondSystemFacade ();
		airCondSystemFacade.start ();
		airCondSystemFacade.stop ();
	}
}
