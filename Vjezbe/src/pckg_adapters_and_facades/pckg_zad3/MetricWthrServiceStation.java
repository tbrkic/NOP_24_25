package pckg_adapters_and_facades.pckg_zad3;

import java.util.concurrent.ThreadLocalRandom;

public class MetricWthrServiceStation implements PrimaryInterface {
	
	private double temp;
	private double wndSpeed;
	
	@Override
	public void readTempC ( ) {
		this.temp = ThreadLocalRandom.current ( ).nextDouble ( - 20 , 48 );
		
	}
	
	@Override
	public void readWndSpdms ( ) {
		this.wndSpeed = ThreadLocalRandom.current ( ).nextDouble ( 0 , 35 );
		
	}
	
	@Override
	public void showWthrData ( ) {
		
		System.out.println ( "******************* Weather data *********************" );
		System.out.println ( toString ( ) );
		
	}
	
	@Override
	public String toString ( ) {
		return "MetricWthrServiceStation [ temp=" + temp + " degree Celsius, wndSpeed=" + wndSpeed + " m/s ]";
	}
	
}
