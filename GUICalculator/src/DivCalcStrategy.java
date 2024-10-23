public class DivCalcStrategy implements CalculationStrategy {
	@Override
	public double performCalculation ( double fst , double snd ) {
		if(snd==0){
			System.out.println ("Division by 0 is not possible!!!" );
			throw new ArithmeticException ( "Zero division!" );
		} else {
			return fst/snd;
		}
	}
	
	@Override
	public String toString ( ) {
		return "Div";
	}
}
