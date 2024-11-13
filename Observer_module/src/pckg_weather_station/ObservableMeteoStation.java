package pckg_weather_station;

public interface ObservableMeteoStation {
	void add ( Observer observer );
	void remove ( Observer observer );
	void notifyAllObservers();
}
