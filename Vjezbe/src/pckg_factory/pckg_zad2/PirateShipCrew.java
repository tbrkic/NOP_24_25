package pckg_factory.pckg_zad2;

public class PirateShipCrew extends Crew {
	
	public PirateShipCrew ( int num ) {
		this.num = num;
	}
	
	@Override
	public void description ( ) {
		System.out.println ( toString ( ) );
		
	}
	
	@Override
	public String toString ( ) {
		return "PirateShipCrew [num=" + num + "]";
	}
}
