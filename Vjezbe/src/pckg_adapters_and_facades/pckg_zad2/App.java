package pckg_adapters_and_facades.pckg_zad2;

public class App {
	public static void main ( String[] args ) {
		NewPlotter newPlotter = new NewPlotter();
		OldPlotter oldPlotter=new OldPlotter ();
		PlotterAdapter plotterAdapter=new PlotterAdapter ( newPlotter );
		System.out.println ("Testing new plotter..." );
		newPlotter.ispisGrafike ();
		System.out.println ("Testing old plotter..." );
		oldPlotter.plotGraphics ();
		System.out.println ("Testing plotter adapter..." );
		plotterAdapter.plotGraphics ();
	}
}
