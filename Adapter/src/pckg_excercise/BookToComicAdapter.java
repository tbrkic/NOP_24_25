package pckg_excercise;

public class BookToComicAdapter implements ComicReader{
	private BookReader bookReader;
	public BookToComicAdapter(BookReader bookReader){
		this.bookReader=bookReader;
	}
	@Override
	public void goToPage ( int numPage ) throws PageOutOfRange {
	bookReader.viewPage ( numPage );
	}
	
	@Override
	public void next ( ) {
		bookReader.nextPage ();
	}
	
	@Override
	public void currentPage ( ) {
	
	}
	
	@Override
	public void previous ( ) {
		bookReader.previousPage ();
	}
	
	@Override
	public void last ( ) {
		bookReader.goToLastPage ();
	}
	
	@Override
	public void first ( ) {
		        bookReader.goToFirstPage ();
	}
	
	@Override
	public void zoom ( int percent ) {
	
	}
	
	@Override
	public void nightReadingMode ( boolean status ) {
		System.out.println ("Sorry, this isn't available for books!" );
	}
}
