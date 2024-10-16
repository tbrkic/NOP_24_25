package pckg_bounds;

public class MainTest {
	public static void main ( String[] args ) {
		String fst = "Some simple string!";
		String snd = "This one is the second one and is slightly different";
		
		CompareTWO<String> compareStrings = new CompareTWO<> (fst,snd  );
	compareStrings.comparisonResult();
	int fstInt = 120;
	int sndInt = 65;
	CompareTWO<Integer> compareInts = new CompareTWO<> ( fstInt,sndInt );
	compareInts.comparisonResult();
	
	
	}
}
