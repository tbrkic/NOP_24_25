package pckg_translate;

public class Translator {
	private int choice;
	private final FranceTranslate franceTranslate;
	private final EnglishTranslator englishTranslator;
	public Translator(){
		System.out.println ("CRO to ENG and CRO to FR translator" );
		englishTranslator=new EnglishTranslator ();
		franceTranslate=new FranceTranslate ();
	}
	public void setChoice(int number){
		this.choice=number;
	}
	public void translateThis(String text){
		switch ( choice ){
			case 1:{
				englishTranslator.translateText ( text );
			} case 2:{
				franceTranslate.translate(text);
			}
		}
	}
}
