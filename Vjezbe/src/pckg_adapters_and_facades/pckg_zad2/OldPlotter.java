package pckg_adapters_and_facades.pckg_zad2;

public class OldPlotter implements OldSoftware{
String oldData= ".\n\n.\t\t.\n\n.\t\t.\t\t.";
	
	@Override
	public void plotGraphics (  ) {
		System.out.println (oldData );
	}
}
