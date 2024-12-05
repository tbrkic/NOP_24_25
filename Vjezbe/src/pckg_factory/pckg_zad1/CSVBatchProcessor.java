package pckg_factory.pckg_zad1;

public class CSVBatchProcessor extends BatchProcessor {
	@Override
	public FileParser createFileParser ( ) {
		return new CSVFileParser ( );
	}
}
