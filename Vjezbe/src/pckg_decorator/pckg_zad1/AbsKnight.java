package pckg_decorator.pckg_zad1;

public abstract class AbsKnight {
	protected String name;
	protected static int POW;
protected int powLevel;
	
	public AbsKnight ( ) {
	}
	
	public abstract void attack ( );
	public abstract int getPowerLevel();
	public abstract void avoidBattle();
	public abstract void description();
	
	
}
