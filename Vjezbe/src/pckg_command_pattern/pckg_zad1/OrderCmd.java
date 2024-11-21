package pckg_command_pattern.pckg_zad1;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderCmd implements IntCmd{
	private int id;
	private int cnt;
	private HashMap<FoodCat, ArrayList<Food> > orders;
	private int tableNumber;
	
	public OrderCmd (Chef chef, HashMap < FoodCat, ArrayList < Food > > orders ) {
		this.orders = orders;
	}
	
	@Override
	public void executeOrder ( ) {
		System.out.println (
				"Order is being executed!"
		                   );
	}
	
	@Override
	public void undoOrder ( ) {
		System.out.println ("Order has been undone!" );
	}
}
