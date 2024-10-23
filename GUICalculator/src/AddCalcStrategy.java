public class AddCalcStrategy implements CalculationStrategy {
	@Override
	public double performCalculation ( double fst , double snd ) {
		return fst+snd;
	}
}
