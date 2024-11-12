package pckg_excercise;

public interface BookReader {
	void viewPage(int page) throws PageOutOfRange;
	void nextPage();
	void previousPage();
	int currentPage();
	void goToLastPage();
	void goToFirstPage();
	void zoom(int percentage);
}
