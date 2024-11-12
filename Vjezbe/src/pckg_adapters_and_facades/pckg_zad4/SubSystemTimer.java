package pckg_adapters_and_facades.pckg_zad4;

public class SubSystemTimer {
	public void program(){
		System.out.println ("Timer subsystem program is set!" );
	}
	public void on(boolean isOn){
	if(isOn){
		System.out.println ("Timer subsystem is turned on!" );
	}else {
		System.out.println ("Timer subsystem is turned off!" );
	}
	}
}
