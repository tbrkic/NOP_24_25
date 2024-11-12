package pckg_adapters_and_facades.pckg_zad3;

public class WthrStatClient {
	
	private static PrimaryInterface objMes;
	
	public static void main ( String[] args ) {
		
		objMes = new MetricWthrServiceStation ( );
		objMes.readTempC ( );
		objMes.readWndSpdms ( );
		objMes.showWthrData ( );
		objMes = new Adapter ( new NonMetricWthrServiceAdaptee ( ) );
		objMes.readTempC ( );
		objMes.readWndSpdms ( );
		objMes.showWthrData ( );
		
		
	}
}
