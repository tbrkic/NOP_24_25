package pckg_ducks;

public class Mute implements Quackable{
	@Override
	public void quack ( ) {
		System.out.println ("Cannot quack at all!!!" );
	}
}
