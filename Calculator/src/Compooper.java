import java.util.Scanner;

public class Compooper {
	private Calculator calculator;
	public Calculator getCalculator ( ) {
		return calculator;
	}
	public void setCalculator ( Calculator calculator ) {
		this.calculator = calculator;
	}
	public void doStuff(){
		Scanner sc = new Scanner ( System.in);
		System.out.println ( "Enter the first number:" );
		Float n1 = sc.nextFloat ( );
		System.out.println ( "Enter the second number:" );
		Float n2 = sc.nextFloat ( );
		System.out.println ( "Enter the operation:" );
		String op = sc.next (  );
		System.out.println (this.calculator.setOperation ( op ) );
	}
}
