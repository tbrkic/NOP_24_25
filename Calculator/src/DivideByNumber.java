public class DivideByNumber implements Divide{
	@Override
	public Float div ( Float n1 , Float n2 ) {
		Float res = null;
		if ( n2 == 0 ) {
			throw new ArithmeticException ( );
		}
		try {
			res = n1 / n2;
			return res;
		}
		catch ( ArithmeticException AE ) {
			System.out.println ( "Cant divide by 0, silly. That results in an infinite number of possibilities!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );
		}
		return res;
	}
}
