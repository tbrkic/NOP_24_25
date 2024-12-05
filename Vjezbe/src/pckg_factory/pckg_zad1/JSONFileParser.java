package pckg_factory.pckg_zad1;

import java.io.File;
import java.util.List;

public class JSONFileParser implements FileParser {
	
	public JSONFileParser ( ) {
		System.out.println ( "\nCreating JSON file parser... " );
	}
	
	@Override
	public List < Record > parse ( File file ) {
		System.out.println ( "Parsing process specific to the JSON file type!!!" );
		System.out.println ( "Parsing file -> " + file.toString ( ) + " and creating records..." );
		return null;
	}
}
