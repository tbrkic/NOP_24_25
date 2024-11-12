package pckg_excercise;

public class SimpleBookReader implements BookReader{
	private Book book;
	private int currentPage;
	private int numPages;
	public SimpleBookReader(){
		System.out.println ("Book reader ready for reading some books!" );
	}
	
	public void setBook ( Book book ) {
		this.book = book;
	this.numPages= book.getTotalPages ( );
	}
	
	@Override
	public void viewPage ( int page ) {
		if(book!=null){
			if(page<=currentPage){}
		}
	}
	
	@Override
	public void nextPage ( ) {
	
	}
	
	@Override
	public void previousPage ( ) {
	
	}
	
	@Override
	public int currentPage ( ) {
		return 0;
	}
	
	@Override
	public void goToLastPage ( ) {
	if(book!=null){
		currentPage= book.getTotalPages ( );
	}
	}
	
	@Override
	public void goToFirstPage ( ){
		if(book!=null){
			currentPage=1;
		}
	}
	
	@Override
	public void zoom ( int percentage ) {
	
	}
}
