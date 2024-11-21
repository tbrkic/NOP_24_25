package pckg_observers.pckg_zad4;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Project implements ObservableInt{
	public String code;
	public String changeDescription;
	public LocalDateTime localDateTime;
	private ArrayList<Coworker> coworkers=new ArrayList<> ();
	
	public Project ( String code ) {
		this.code = code;
	}
	public void addCodeToProject(String code1, String description){
		this.changeDescription=description;
	this.localDateTime=LocalDateTime.now ();
		this.code.concat ( code1 );
	}
	
	@Override
	public void notifyCoworkers ( ) {
for(Coworker i : coworkers){
	i.update ( this );
}
	}
	
	@Override
	public void addPeopleToProject ( Coworker coworker ) {
	coworkers.add ( coworker );
	}
	
	@Override
	public void removePeopleFromProject ( Coworker coworker ) {
	coworkers.remove ( coworker );
	}
}
