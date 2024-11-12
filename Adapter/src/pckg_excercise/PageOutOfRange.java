package pckg_excercise;

public class PageOutOfRange extends Exception {
private static final String msg="Page out of range";
	public PageOutOfRange(String msg){
		super(msg);
	}
}
