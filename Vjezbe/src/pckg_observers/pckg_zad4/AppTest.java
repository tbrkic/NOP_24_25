package pckg_observers.pckg_zad4;

public class AppTest {
	public static void main ( String[] args ) {
		Coworker coworker1=new Coworker ( "Bobby" );
		Coworker coworker2=new Coworker ( "Tommy" );
		Project project1 = new Project ( "while this do that" );
		project1.addPeopleToProject ( coworker1 );
		coworker1.displayProject ();
		project1.addCodeToProject ( "\nif that do this","added an if statement" );
		coworker1.update ( project1 );
		coworker1.displayProject ();
	}
}
