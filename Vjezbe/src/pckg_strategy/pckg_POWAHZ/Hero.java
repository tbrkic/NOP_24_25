package pckg_strategy.pckg_POWAHZ;

public class Hero{
	PowahStrategy power;
	void setAndApplyPowerStrategy(PowahStrategy powerStrategy){
		this.power=powerStrategy;
	}
	public Hero(PowahStrategy power){
		this.power=power;
	}
	
	@Override
	public String toString ( ) {
		return "Hero{" +
		       "power=" + power +
		       '}';
	}
}
