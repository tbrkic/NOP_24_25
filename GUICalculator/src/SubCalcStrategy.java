public class SubCalcStrategy implements CalculationStrategy {
	@Override
	public double performCalculation ( double fst , double snd ) {
		return fst-snd;
	}
	
	@Override
	public String toString ( ) {
		return "Sub";
	}
}
