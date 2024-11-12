package pckg_excercise;

public class Book {
	private String title;
	private String author;
	private int totalPages;
	
	public Book ( String title , String author , int totalPages ) {
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
	}
	
	public String getTitle ( ) {
		return title;
	}
	
	public String getAuthor ( ) {
		return author;
	}
	
	public int getTotalPages ( ) {
		return totalPages;
	}
}
