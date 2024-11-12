package pckg_adapters_and_facades.pckg_zad2;

public class PlotterAdapter implements OldSoftware{
	NewPlotter newPlotter;
	public PlotterAdapter(NewPlotter newPlotter){
		this.newPlotter=newPlotter;
	}
	@Override
	public void plotGraphics ( ) {
		System.out.println (newPlotter.newData );
	}
}
