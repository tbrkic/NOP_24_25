package pckg_weather_station;

public class AppCli {
	public static void main ( String[] args ) {
		WeatherStation weatherStation = new WeatherStation ( 5,76,1012 );
		MobileObserverApp moa1=new MobileObserverApp (  );
		weatherStation.add ( moa1 );
		weatherStation.setStateWeatherData ( 1234 , 7 , 76 );
		moa1.display ();
		moa1.display ();
		
	}
}
