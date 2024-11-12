package pckg_excercise;

public class SimpleComicReader implements ComicReader{
	private Comic comic;
	private int currentPage;
	private int totalPages;
	private int zoom;
	private boolean nightReading=false;
	private int MAX_PERCENT=200;
	private int MIN_PERCENT=20;
	
	
	public SimpleComicReader(){
		System.out.println ("Ready to read some comics..." );
		System.out.println ("Please provide some comics to read!" );
	}
	@Override
	public void goToPage ( int numPage ) throws PageOutOfRange {
		if(comic!=null){
		if(numPage<=totalPages){
			this.currentPage=numPage;
			System.out.println ("We are on the page: "+numPage );
		}
		}
	}
	
	public void setComic ( Comic comic ) {
		this.comic = comic;
		this.currentPage=1;
		totalPages=comic.getTotalPages ();
		this.zoom=100;
	}
	
	@Override
	public void next ( ) {
		 if(comic!=null){
			 if(currentPage<totalPages){
				 currentPage+=1;
				 System.out.println ("Next page is opened: "+currentPage );
			 } else {
				 System.out.println ("Last page reached - there is nothing left to read!!!" );
			 }
		 }
	}
	
	@Override
	public void currentPage ( ) {
	
	}
	
	@Override
	public void previous ( ) {
	if(comic!=null){
		if(currentPage==1){
			System.out.println ("Can't go further back, the first page was reached!!!" );
		} else {
			currentPage-=1;
			System.out.println ("Turned back a page!" );
		}
	}
	}
	
	@Override
	public void last ( ) {
	if(comic!=null){
		currentPage=totalPages;
	}
	}
	
	@Override
	public void first ( ) {
		      if(comic!=null){
				  currentPage=1;
		      }
	}
	
	@Override
	public void zoom ( int percent ) {
	if(comic!=null){
		if(percent<=MAX_PERCENT && percent>=MIN_PERCENT ){
			zoom=percent;
		}
	}
	}
	
	@Override
	public void nightReadingMode ( boolean status ) {
	        nightReading=status;
	}
}
