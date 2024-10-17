public abstract class Calculator {
	Float n2;
	Float n1;
	private Add add;
	private Subtract subtract;
private Divide divide;
private Multiply multiply;
private Power power;
public String setOperation(String operation){
	Float result = null;
	switch(operation){
		case "div":
			result =divide.div ( n1 , n2);
		case "mul":
			result =multiply.mul (  n1 ,   n2);
		case "add":
			result =add.add (  n1 ,  n2);
		case "sub":
			result =subtract.sub (  n1 ,  n2);
		case "pow":
			result = power.power (  n1 ,  n2);
	}
	return result.toString ();
}
	
	public void setAdd ( Add add ) {
		this.add = add;
	}
	
	public void setSubtract ( Subtract subtract ) {
		this.subtract = subtract;
	}
	
	public void setDivide ( Divide divide ) {
		this.divide = divide;
	}
	
	public void setPower ( Power power ) {
		this.power = power;
	}
	
	public void setMultiply ( Multiply multiply ) {
		this.multiply = multiply;
	}
}
