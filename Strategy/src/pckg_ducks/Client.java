package pckg_ducks;

public class Client {
	private Duck duck;
	public void setDuck(Duck duck){
		this.duck=duck;
	}
	
	public Duck getDuck ( ) {
		return duck;
	}
	
	public void startSimulation ( ){
		System.out.println ("Starting simulation for: "+this.duck.getClass ().getSimpleName () );
	}
}
