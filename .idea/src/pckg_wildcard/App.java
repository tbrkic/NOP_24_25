package pckg_wildcard;

import java.util.List;

public class App {
	public static void main ( String[] args ) {
		List <Integer> ints = List.of ( 1,2,3,4 );
		MultiListCLS<Integer> multiFST = new MultiListCLS<> ( ints );
		List<Integer> sndInts = List.of(23,45,98,123,54,234,45,234);
		multiFST.compareTwoLists(sndInts);
	}
}
