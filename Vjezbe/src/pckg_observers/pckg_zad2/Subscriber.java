package pckg_observers.pckg_zad2;

import java.util.ArrayList;

public class Subscriber implements SubscriberInt{
	private String mail;
	private ArrayList<Magazine> magazinesSubscribedTo;
	
	public Subscriber ( String mail ) {
		this.mail = mail;
		magazinesSubscribedTo=new ArrayList<> ();
	}
	
	@Override
	public void subscribe ( Magazine magazine ) {
	magazinesSubscribedTo.add(magazine);
	}
	
	@Override
	public void unsubscribe ( Magazine magazine ) {
	magazinesSubscribedTo.remove ( magazine );
	}
	
	@Override
	public void update ( ) {
		System.out.println ("Listing magazines for: "+this.mail);
		for(Magazine i : magazinesSubscribedTo){
			System.out.println ( i.text );
		}
		
	}
}
