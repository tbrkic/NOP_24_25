package pckg_ducks;

public class AppTest {
	public static void main ( String[] args ) {
		Client client = new Client ();
		client.startSimulation ();
		client.setDuck (new MallardDuck ());
		client.getDuck ().setFlyable (new FlyWithWings() );
		client.startSimulation ();
		// napraviti jednostavni kalkulator koristeći ove strategije
	}
}
