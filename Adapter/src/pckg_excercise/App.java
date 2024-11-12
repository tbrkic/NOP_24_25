package pckg_excercise;

public class App {
	public static void main ( String[] args ) {
		Comic comic=new Comic ( "Captain America","DT & CH",100 );
		SimpleComicReader comicReader = new SimpleComicReader ();
		Client client=new Client ();
		client.setComicReader ( comicReader );
		Book book =new Book ( "The last principle","A. G. Marty",230 );
		SimpleBookReader bookReader=new SimpleBookReader ();
		
	}
}
