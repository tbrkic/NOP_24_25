package weather_station_pckg;

public class MobilePhoneWeatherApp implements Observer, Display{
	private double temp;
	private double hum;
	private double press;
	private WeatherStation weatherStation;
	
	public void setWeatherStation ( WeatherStation weatherStation ) {
		this.weatherStation = weatherStation;
	}
	
	@Override
	public void display ( ) {
		System.out.println ("Temperature: "+temp );
		System.out.println ("Humidity: "+hum );
		System.out.println ("Pressure: "+press );
	}
	
	@Override
	public void update ( ) {
	this.hum= weatherStation.getHumidity ( );
	this.press= weatherStation.getPressure ( );
	this.temp= weatherStation.getTemperature ( );
		System.out.println ("All is updated!" );
	}
}
