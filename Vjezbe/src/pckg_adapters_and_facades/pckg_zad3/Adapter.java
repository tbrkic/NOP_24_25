package pckg_adapters_and_facades.pckg_zad3;

public class Adapter implements PrimaryInterface {
	
	private NonMetricWthrServiceAdaptee wthrSer;
	private double temp;
	private double spd;
	
	public Adapter ( NonMetricWthrServiceAdaptee adapteeWthrServ ) {
		this.wthrSer = adapteeWthrServ;
	}
	
	@Override
	public void readTempC ( ) {
		wthrSer.readTempInF ( );
		this.temp = convertFintoC ( wthrSer.getTempF ( ) );
	}
	
	@Override
	public void readWndSpdms ( ) {
		wthrSer.readWndSpdInKn ( );
		this.spd = convertKnintoMs ( wthrSer.getWndSpdKn ( ) );
		
	}
	
	@Override
	public void showWthrData ( ) {
		System.out.println ( "\n" );
		System.out.println ( "******************* Weather data *********************" );
		System.out.println ( "Input data from " + wthrSer.getClass ( ).getSimpleName ( ) + ":" );
		wthrSer.showMeasuredData ( );
		System.out.println ( "Data after using adapter:" );
		System.out.println ( toString ( ) );
		
	}
	
	private double convertFintoC ( double inF ) {
		
		double convertedTmp = ( inF - 32 ) * 0.556;
		return convertedTmp;
	}
	
	private double convertKnintoMs ( double inKn ) {
		
		double convertedSpd = inKn / 1.944;
		return convertedSpd;
	}
	
	@Override
	public String toString ( ) {
		return "Adapter for [wthrSer = " + wthrSer.getClass ( ).getSimpleName ( ) + ", Converted data -> temp = " + temp + " in Celsius, spd = " + spd + " m/s]";
	}
	
}
