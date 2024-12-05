package pckg_factory.pckg_zad2;

public class PirateShip extends Ship {
	
	
	public PirateShip ( String name ) {
		
		this.name = name;
	}
	
	@Override
	public void description ( ) {
		System.out.println ( toString ( ) );
	}
	
	@Override
	public String toString ( ) {
		return "PirateShip [name=" + name + "]";
	}
}
