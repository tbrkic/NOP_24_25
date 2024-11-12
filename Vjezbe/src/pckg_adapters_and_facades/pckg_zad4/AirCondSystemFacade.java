package pckg_adapters_and_facades.pckg_zad4;

public class AirCondSystemFacade {
	private SubSystem1 subSystem1=new SubSystem1 ();
	private SubSystem2 subSystem2=new SubSystem2 ();
	private SubSystem3 subSystem3=new SubSystem3 ();
	private SubSystemEnergy subSystemEnergy=new SubSystemEnergy ();
	private SubSystemTimer subSystemTimer=new SubSystemTimer ();
	public void start(){
		subSystem1.setMode ();
		subSystem2.setTemperature ();
		subSystem2.fanSpeed ();
		subSystem3.turnIonizer ( true );
		subSystemEnergy.on ();
		subSystemEnergy.mode ();
		subSystemEnergy.start ();
		subSystemTimer.program ();
		subSystemTimer.on ( true );
	}
	public void stop(){
		subSystemTimer.on ( false );
		subSystemTimer.program ();
		subSystemEnergy.start ();
		subSystemEnergy.mode ();
		subSystemEnergy.on ();
		subSystem3.turnIonizer ( false );
		subSystem2.fanSpeed ();
		subSystem2.setTemperature ();
		subSystem1.setMode ();
	}
}
