package pckg_factory.pckg_zad1;

import java.io.File;
import java.util.List;

public class TextFileParser implements FileParser {
	
	public TextFileParser ( ) {
		System.out.println ( "\nCreating TXT file parser... " );
	}
	
	@Override
	public List < Record > parse ( File file ) {
		System.out.println ( "Parsing process specific to the TXT file type!!!" );
		System.out.println ( "Parsing file -> " + file.toString ( ) + " and creating records..." );
		return null;
	}
	
}
