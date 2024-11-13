package pckg_weather_station;

import java.util.ArrayList;
import java.util.List;
import weather_station_pckg.ObservableMeteoStation;
import weather_station_pckg.Observer;

public class WeatherStation implements ObservableMeteoStation {
	private double temperature;
	private double humidity;
	private double pressure;
	private final List < weather_station_pckg.Observer > observers;
	
	public WeatherStation ( double temperature , double humidity , double pressure ) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.observers=new ArrayList <> ();
	}
	
	@Override
	public void add ( weather_station_pckg.Observer observer ) {
	if(observers.contains ( observer )){
		System.out.println ("Observer is already in list!!!" );
	}else{
		observers.add ( observer );
		System.out.println ("Successfully added observer!!!" );
	}
	}
	
	@Override
	public void remove ( weather_station_pckg.Observer observer ) {
	
	}
	
	@Override
	public void notifyAllObservers ( ) {
	for( Observer i:observers){
	i.update ();
	}
	}
	
	public double getTemperature ( ) {
		return temperature;
	}
	
	public double getHumidity ( ) {
		return humidity;
	}
	
	public double getPressure ( ) {
		return pressure;
	}
	public void setStateWeatherData(double p, double t, double h){
		this.humidity=h;
		this.pressure=p;
		this.temperature=t;
		System.out.println ("States set!" );
		notifyAllObservers ();
	}
}
