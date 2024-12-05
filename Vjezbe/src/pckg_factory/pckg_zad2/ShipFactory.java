package pckg_factory.pckg_zad2;

public interface ShipFactory {
	
	public Captain createCaptain ( String name );
	
	public Ship createShip ( String name );
	
	public Crew createCrew ( int num );
	
	public PropulsionSystem createPropulsionSystem ( );
	
}
