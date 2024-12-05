package pckg_factory.pckg_zad2;

import pckg_factory.pckg_zad2.Simulator.ShipFactoryCreator;
import pckg_factory.pckg_zad2.Simulator.ShipFactoryCreator.ShipType;

public class SimApp {
	
	public static void main ( String[] args ) {
		Simulator simulator = new Simulator ( "Jack" , "Pearl" , 25 );
		simulator.runSimulation ( ShipFactoryCreator.createShipFactory ( ShipType.PIRATE ) );
	}
	
}
