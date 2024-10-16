package pckg_bounds;

public class CompareTWO <T extends Comparable>{
	private final T fst;
	private final T snd;
	
	public CompareTWO ( T fst , T snd ) {
		this.fst = fst;
		this.snd = snd;
	}
	public void comparisonResult(){
		if(fst.compareTo ( snd )>0){
			System.out.println (fst+" is greater than "+snd );
		}
		else if ( fst.compareTo ( snd )<0 ) {
			System.out.println (snd+" is greater than "+fst );
		} else{
			System.out.println ("Both are of equal value" );
		}
	}
}
