package pckg_wildcard;

import java.util.List;

public class Test {
	public static void main ( String[] args ) {
		ListCLS<Integer> fstList = new ListCLS < Integer > ();
		fstList.addNewElement(12);
		fstList.addNewElement ( 120 );
		fstList.addNewElement ( 2 );
		fstList.addNewElement ( 20 );
		fstList.listAllElements();
	}
}
