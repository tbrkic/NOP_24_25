package pckg_translate;

public class TestNew {
	public static void main ( String[] args ) {
		String text= "Ovo je neki tekst koji želim prevesti na izabrani jezik";
		TranslatorNew translatorNew=new TranslatorNew ();
		translatorNew.setTranslate ( new ENGTranslate () );
		translatorNew.translateThisText ( text );
		translatorNew.setTranslate ( new FRTranslate () );
		translatorNew.translateThisText ( text );
	}
}
