package pckg_observers.pckg_zad1;

public class AppClient {
	public static void main ( String[] args ) {
			
				
				OnlineStore store = new OnlineStore ( "Best online store" );
				Customer cust1 = new Customer ( "Fst customer" );
				Customer cust2 = new Customer ( "Snd customer" );
				store.setItemAvailability ( new Item ( "Xbox Series X" , "Game Console" ) );
				store.add2AvailLst ( cust1 );
				store.add2AvailLst ( cust2 );
				store.notifyCsts ( );
			
	}
}
