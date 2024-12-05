package pckg_decorator.pckg_zad1;

public class FstRangKnightDecorator extends AbsKnight implements KnightDecoratorInt{
	private AbsKnight knight;
	
	public FstRangKnightDecorator ( AbsKnight absKnight ) {
		this.name= absKnight.name;
	}
	
	@Override
	public void attack ( ) {
		System.out.println ( this.getClass ( ).getSimpleName ( ) + " is attacking with the strength of: " + this.getPowerLevel ( ) );
	}
	
	@Override
	public int getPowerLevel ( ) {
		return 20;
	}
	
	@Override
	public void avoidBattle ( ) {
		System.out.println (this.getClass ().getSimpleName ()+" is fastwalking away from battle!!!" );
	}
	
	@Override
	public void description ( ) {
		System.out.println (this.getClass ().getSimpleName ()+" has the strength of "+this.getPowerLevel ()+" and has a knife and a sword." );
	}
	
	@Override
	public String toString ( ) {
		return "FstRangKnightDecorator{" +  knight+
		       ", name='" + name + '\'' +
		       ", powLevel=" + this.getPowerLevel ()+
		       '}';
	}
	@Override
	public void setKnight2Decorate ( AbsKnight absKnight ) {
		this.knight=absKnight;
	}
}
