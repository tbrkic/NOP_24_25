package pckg_adapters_and_facades.pckg_zad1;

public class AppCli {
	
	public static void main ( String[] args ) {
		NovelWriter nw = new NovelWriter ( "Famous novel writer" );
		nw.writeNovel ( 1 );
		nw.writeNovel ( 3 );
		WriterAdapter wa = new WriterAdapter ( new OldNovelist ( "SF novel writer" ) );
		wa.writeNovel ( 10 );
	}
	
}
