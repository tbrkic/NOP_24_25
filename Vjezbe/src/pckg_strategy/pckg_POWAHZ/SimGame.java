package pckg_strategy.pckg_POWAHZ;

import java.util.ArrayList;
import java.util.Scanner;

public class SimGame {
	public static void main ( String[] args ) {
		Scanner sc =new Scanner ( System.in );
		Hero hero= new Hero ( new NoobStrategy() );
		ArrayList<String> levels = new ArrayList<> ();
	for(levels.size (); levels.size ( )<5;){
		levels.add ( sc.next ( ) );
		if( levels.size ( )==1){
			hero.setAndApplyPowerStrategy ( new SpeedStrategy() );
			hero.power.applyPOWAH ();
		} else if( levels.size ( )==2){
		hero.setAndApplyPowerStrategy ( new FlyingStrategy () );
			hero.power.applyPOWAH ( );
		}else if( levels.size ( )==3){
			hero.setAndApplyPowerStrategy ( new DoubleStrength () );
			hero.power.applyPOWAH ( );
		}else if( levels.size ( )==4){
			hero.setAndApplyPowerStrategy ( new HighJump () );
			hero.power.applyPOWAH ( );
		}
	}
	}
}
