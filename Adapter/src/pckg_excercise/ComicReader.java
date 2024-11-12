package pckg_excercise;

public interface ComicReader {
	void goToPage(int numPage) throws PageOutOfRange;
	void next();
	void currentPage();
	void previous();
	void last();
	void first();
	void zoom(int percent);
	void nightReadingMode(boolean status);
}
