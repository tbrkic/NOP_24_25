package pckg_factory.pckg_zad1;

public class JSONBatchProcessor extends BatchProcessor {
	@Override
	public FileParser createFileParser ( ) {
		return new JSONFileParser ( );
	}
}
