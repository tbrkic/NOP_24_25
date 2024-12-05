package pckg_factory.pckg_zad1;

public class TXTBatchProcessor extends BatchProcessor {
	
	@Override
	public FileParser createFileParser ( ) {
		return new TextFileParser ( );
	}
}
