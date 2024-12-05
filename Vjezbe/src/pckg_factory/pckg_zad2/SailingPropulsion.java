package pckg_factory.pckg_zad2;

public class SailingPropulsion extends PropulsionSystem {
	
	public SailingPropulsion ( ) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void description ( ) {
		System.out.println ( toString ( ) );
	}
	
	@Override
	public String toString ( ) {
		return "Sailing Propulsion [only on wind]";
	}
}
