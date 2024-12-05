package pckg_decorator.pckg_zad1;

public class SimpleKnight extends AbsKnight{
	public SimpleKnight (String name ) {
		this.name=name;
	}
	
	@Override
	public void attack ( ) {
		System.out.println (this.getClass ().getSimpleName ()+" is attacking with the strength of: "+this.getPowerLevel () );
	}
	
	@Override
	public int getPowerLevel ( ) {
		return 10;
	}
	
	@Override
	public void avoidBattle ( ) {
		System.out.println (this.getClass ().getSimpleName ()+" is avoiding battle!" );
	}
	
	@Override
	public void description ( ) {
		System.out.println (this.getClass ().getSimpleName ()+" has the power level of "+this.getPowerLevel ()+" without any weapons and can walk away from battle." );
	}
	
	@Override
	public String toString ( ) {
		return "SimpleKnight{" +
		       "name='" + name + '\'' +
		       ", powLevel=" + this.getPowerLevel () +
		       '}';
	}
}
