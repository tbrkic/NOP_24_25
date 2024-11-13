package pckg_translate;

public class TranslatorNew {
	private Translate translate;
	public void setTranslate(Translate translate){
		this.translate=translate;
	}
	public void translateThisText(String text){
		translate.translate ( text );
	}
}
