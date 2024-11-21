package pckg_command_pattern.pckg_zad1;

import java.util.ArrayList;
import java.util.HashMap;

public class Chef {
	private String chefName;
	
	public Chef ( String chefName ) {
		this.chefName = chefName;
	}
public void analyseOrder(){
	System.out.println ("Analysing order..." );
}
public void collectFoodStaff( HashMap <FoodCat, ArrayList<Food> >  order){
	System.out.println ("Collecting food:" );
	for(FoodCat i : order.keySet ( )){
		System.out.println (i );
		for(Food e : order.get(i)){
			System.out.println (e );
		}
	}
}
	
	public void prepareFood ( HashMap < FoodCat, ArrayList < Food > > order ) {
		System.out.println ( "Preparing food:" );
		for ( FoodCat i : order.keySet ( ) ) {
			System.out.println ( i );
			for ( Food e : order.get ( i ) ) {
				System.out.println ( e );
			}
		}
	}
	public void stopAndRecall(){
		System.out.println (this.getClass ().getSimpleName ()+" stopped to think." );
	}
}
