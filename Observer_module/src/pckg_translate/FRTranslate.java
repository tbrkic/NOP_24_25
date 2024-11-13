package pckg_translate;

public class FRTranslate implements Translate {
	
	@Override
	public void translate ( String text ) {
		System.out.println (this.getClass ().getSimpleName ()+" performing translation..." );
		System.out.println ("Text in CRO:\n"+text );
		System.out.println ( "==========================" );
		System.out.println ( "Translating to FR..." );
	}
}
