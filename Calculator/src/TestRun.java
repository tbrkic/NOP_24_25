import java.util.Scanner;

public class TestRun {
	public static void main ( String[] args ) {
		Compooper compooper = new Compooper();
		compooper.setCalculator ( new CalculatorApp() );
		compooper.getCalculator ().setAdd ( new AddANumber() );
		compooper.getCalculator ().setDivide ( new DivideByNumber () );
		compooper.getCalculator ().setMultiply ( new MultiplyByNumber () );
		compooper.getCalculator ().setSubtract ( new SubtractByNumber () );
		compooper.getCalculator ().setPower ( new PowerOfNumber () );
		Scanner sc1= new Scanner ( System.in );
		System.out.println ("This is a calculator app. You may type two numbers of any value followed by a operation(add, sub, div, mul or pow). Butt first, you may decide to stop if you type 'n'."  );
		if ( sc1.next ( ).equals ( "n" ) ) {
		}
		else {
			compooper.doStuff ( );
			System.out.println ( "Wanna do it again?" );
		}
	}
}
