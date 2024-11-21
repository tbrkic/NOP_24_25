package pckg_observers.pckg_zad4;

import java.time.LocalDateTime;

public class Coworker implements ProjectObserver{
	private String name;
	private String currentCode;
	private String changeDescription;
	private LocalDateTime localDateTime;
	
	public Coworker ( String name ) {
		this.name = name;
	}
	public void displayProject() {
		System.out.println ("Description of change: "+changeDescription+"\nTime of change: "+localDateTime+"\nCode: "+currentCode );
	}
	
	@Override
	public void update ( Project project ) {
		currentCode=project.code;
		localDateTime=project.localDateTime;
		changeDescription=project.changeDescription;
	}
}
