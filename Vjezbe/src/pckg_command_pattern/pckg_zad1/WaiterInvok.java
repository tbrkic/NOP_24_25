package pckg_command_pattern.pckg_zad1;

public class WaiterInvok {
	private String waitName;
	private IntCmd intCmd;
	
	public WaiterInvok ( String waitName ) {
		this.waitName = waitName;
	}
	
	public void setOrderCmd(IntCmd intCmd){
		this.intCmd=intCmd;
	}
	public void setUpOrder(){
		System.out.println ("Setting up order..." );
	}
	public void withdrawOrder(){
		System.out.println ("Withdrawing order..." );
	}
}
