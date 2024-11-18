package pckg_observers.pckg_zad4;

public class Coworker implements ProjectObserver{
	private String name;
	
	public Coworker ( String name ) {
		this.name = name;
	}
	
	@Override
	public void update ( Project project ) {
	
	}
}
