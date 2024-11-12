package pckg_excercise;

public class Client {
	private ComicReader comicReader;
	public Client(){
		System.out.println ("Some client that expects ComicReader!" );
	}
	
	public void setComicReader ( ComicReader comicReader ) {
		this.comicReader = comicReader;
	}
	public void giveMeThisPage(int page) throws PageOutOfRange {
		comicReader.goToPage ( page );
	}
}
