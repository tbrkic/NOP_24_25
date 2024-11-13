package weather_station_pckg;

import java.util.Observer;

public class App {
	public static void main ( String[] args ) {
		WeatherStation weatherStation= new WeatherStation ( 9,70,1015 );
		MobilePhoneWeatherApp mpwa1= new MobilePhoneWeatherApp ();
		MobilePhoneWeatherApp mpwa2=new MobilePhoneWeatherApp ();
		mpwa1.setWeatherStation ( weatherStation );
		mpwa2.setWeatherStation ( weatherStation );
		weatherStation.add ( mpwa1 );
		weatherStation.add (  mpwa2 );
		weatherStation.setStateWeatherData ( 1014,8,79 );
		
	}
}
