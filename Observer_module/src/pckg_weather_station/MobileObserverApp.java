package pckg_weather_station;

import java.util.ArrayList;

public class MobileObserverApp implements Observer, Display{
	double[] values2Display=new double[3];
	
	public MobileObserverApp (  ) {
	}
	
	@Override
	public void display ( ) {
			System.out.println ("Pressure: "+values2Display[0] );
			System.out.println ("Temperature: "+values2Display[1] );
			System.out.println ("Humidity: "+values2Display[2] );
	
	}
	
	@Override
	public void update ( double p , double t , double h ) {
	 values2Display[0]=p;
	 values2Display[1]=t;
	 values2Display[2]=h;
	}
	
	@Override
	public void register ( ObservableMeteoStation observableMeteoStation ) {
		observableMeteoStation.add(this);
	}
	
	@Override
	public void unregister ( ObservableMeteoStation observableMeteoStation ) {
observableMeteoStation.remove ( this );
	}
}
