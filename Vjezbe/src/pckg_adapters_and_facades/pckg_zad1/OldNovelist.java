package pckg_adapters_and_facades.pckg_zad1;

public class OldNovelist {
	private String name;
	public OldNovelist ( String writer ) {
		name = writer;
	}
	public void writeSFNovel ( ) {
		System.out.println ( name + " writing a SF novel..." );
		System.out.println ( toString ( ) );
		System.out.println ( "****************************************" );
	}
	@Override
	public String toString ( ) {
		return "OldNovelist [name=" + name + "]";
	}
}
