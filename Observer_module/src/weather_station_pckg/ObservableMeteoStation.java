package weather_station_pckg;

public interface ObservableMeteoStation {
	void add ( Observer observer );
	void remove ( weather_station_pckg.Observer observer );
	void notifyAllObservers();
}
