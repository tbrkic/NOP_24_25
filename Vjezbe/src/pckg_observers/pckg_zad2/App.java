package pckg_observers.pckg_zad2;

public class App {
	public static void main ( String[] args ) {
		Subscriber sub1 = new Subscriber ( "Tom" );
		Subscriber sub2 = new Subscriber ( "Bob" );
		MonthlyMagazine monthlyMagazine = new MonthlyMagazine ( "Monthly Magazine" );
		QuarterlyMagazine quarterlyMagazine =new QuarterlyMagazine ( "Quarterly Magazine" );
		sub1.subscribe ( monthlyMagazine);
		sub1.subscribe ( quarterlyMagazine );
		sub2.subscribe ( quarterlyMagazine );
		sub1.update ();
		sub2.update ();
	}
}
