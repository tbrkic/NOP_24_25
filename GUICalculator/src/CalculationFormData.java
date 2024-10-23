public record CalculationFormData( double fst, double snd, double result, CalculationStrategy calculationStrategy) {
	@Override
	public String toString ( ) {
		return "CalculationFormData{" +
		       "fst=" + fst +
		       ", snd=" + snd +
		       ", result=" + result +
		       ", calculationStrategy=" + calculationStrategy +
		       '}';
	}
}
