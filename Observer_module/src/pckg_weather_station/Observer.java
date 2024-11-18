package pckg_weather_station;

public interface Observer {
	void update(double p, double t, double h);
	void register(ObservableMeteoStation observableMeteoStation);
	void unregister(ObservableMeteoStation observableMeteoStation);
}
