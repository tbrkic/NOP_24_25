package pckg_factory.pckg_zad1;

import java.io.File;

public class AppCli {
	
	public static void main ( String[] args ) {
		
		File file1 = new File ( "C://Documents/fileName.json" );
		File file2 = new File ( "someFile.csv" );
		File file3 = new File ( "Fle.txt" );
		String nme1 = file1.getName ( );
		String ext1 = getFileExtension ( nme1 );
		BatchProcessor bp1 = createBatchProcessor ( ext1 );
		bp1.processBatch ( file1 );
		String nme2 = file2.getName ( );
		String ext2 = getFileExtension ( nme2 );
		BatchProcessor bp2 = createBatchProcessor ( ext2 );
		bp2.processBatch ( file2 );
		String nme3 = file3.getName ( );
		String ext3 = getFileExtension ( nme3 );
		BatchProcessor bp3 = createBatchProcessor ( ext3 );
		bp3.processBatch ( file3 );
	}
	
	private static String getFileExtension ( String file ) {
		if ( file.contains ( "." ) ) {
			String ext = file.substring ( file.lastIndexOf ( "." ) + 1 );
			return ext;
		}
		else {
			return null;
		}
	}
	
	private static BatchProcessor createBatchProcessor ( String ext ) {
		switch ( ext ) {
			case "txt":
				return new TXTBatchProcessor ( );
			case "csv":
				return new CSVBatchProcessor ( );
			case "json":
				return new JSONBatchProcessor ( );
			default:
				System.out.println ( "There is no BatchProcessor for such file type yet !!!" );
				return null;
		}
	}
}
