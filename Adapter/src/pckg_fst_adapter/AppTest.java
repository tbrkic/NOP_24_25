package pckg_fst_adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
	public static void main ( String[] args ) {
		ArrayList<String> stringList = new ArrayList <> ( Arrays.asList ( new String[] { "a" , "b" , "c" } ) );
		Client<String> clientFst = new Client <> ( stringList.iterator () );
//		clientFst.someInfo ();
		clientFst.removeFetchedElement ();
		clientFst.someInfo ();
	}
}
