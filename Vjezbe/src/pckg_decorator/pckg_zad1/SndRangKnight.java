package pckg_decorator.pckg_zad1;

public class SndRangKnight extends AbsKnight implements KnightDecoratorInt{
	private AbsKnight knight;
	
	public SndRangKnight ( AbsKnight absKnight ){
		this.name=absKnight.name;
	}
	
	@Override
	public void attack ( ) {
		System.out.println ( this.getClass ( ).getSimpleName ( ) + " is attacking with the strength of: " + this.getPowerLevel ( ) );
	}
	
	@Override
	public int getPowerLevel ( ) {
		return 30;
	}
	
	@Override
	public void avoidBattle ( ) {
		System.out.println (this.getClass ().getSimpleName ()+" is running away from battle!!!");
	}
	
	@Override
	public void description ( ) {
		System.out.println (this.getClass ().getSimpleName ()+" has the strength of "+this.getPowerLevel ()+" , a mace, and can jump over obstacles." );
	}
	
	@Override
	public String toString ( ) {
		return "SndRangKnight{" + knight+
		       ", name='" + name + '\'' +
		       ", powLevel=" + this.getPowerLevel () +
		       '}';
	}
	
	@Override
	public void setKnight2Decorate ( AbsKnight absKnight ) {
	this.knight=absKnight;
	}
}
