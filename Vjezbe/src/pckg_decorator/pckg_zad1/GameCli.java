package pckg_decorator.pckg_zad1;

public class GameCli {
	public static void main ( String[] args ) {
		SimpleKnight simpleKnight=new SimpleKnight ( "Arthuros" );
		FstRangKnightDecorator fstRangKnightDecorator=new FstRangKnightDecorator ( simpleKnight );
	SndRangKnight sndRangKnight = new SndRangKnight ( simpleKnight );
	fstRangKnightDecorator.setKnight2Decorate ( simpleKnight );
	sndRangKnight.setKnight2Decorate ( simpleKnight );
		System.out.println (sndRangKnight );
		System.out.println (simpleKnight );
		System.out.println (fstRangKnightDecorator );
	}
}
