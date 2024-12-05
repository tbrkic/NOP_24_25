package pckg_factory.pckg_zad1;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
	
	public final void processBatch ( File file ) {
		
		FileParser parser = null;
		parser = createFileParser ( );
		List < Record > records = parser.parse ( file );
		processRecords ( records );
		writeSummary ( );
		closeFile ( file );
	}
	
	public abstract FileParser createFileParser ( );
	
	private void processRecords ( List < Record > records ) {
		System.out.println ( "Processing all records..." );
	}
	
	private void writeSummary ( ) {
		System.out.println ( "Writing summary related to parsing process ..." );
	}
	
	private void closeFile ( File file ) {
		System.out.println ( "Closed file -> " + file.toString ( ) );
	}
	
}
