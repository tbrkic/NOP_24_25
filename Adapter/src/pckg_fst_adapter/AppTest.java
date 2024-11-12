package pckg_fst_adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.StringTokenizer;

public class AppTest {
	public static void main ( String[] args ) {
		ArrayList<String> stringList = new ArrayList <> ( Arrays.asList ( new String[] { "a" , "b" , "c" } ) );
		Client<String> clientFst = new Client <> ( stringList.iterator () );
//		clientFst.someInfo ();
		clientFst.removeFetchedElement ();
		clientFst.someInfo ();
		System.out.println (stringList );
		Enumeration enumString = new StringTokenizer ( "This is some string" );
		AdapterEnumeration adapterEnumeration = new AdapterEnumeration<> ( enumString );
		Client<String> sndClient = new Client<> ( adapterEnumeration );
		sndClient.someInfo();
	}
}
