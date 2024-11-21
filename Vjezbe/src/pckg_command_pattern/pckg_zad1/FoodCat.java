package pckg_command_pattern.pckg_zad1;

public class FoodCat {
	private int id;
	private int cnt;
	
	public FoodCat (EnumFoodCat  enumFoodCat ) {
		this.id = cnt++;
	}
	
	@Override
	public String toString ( ) {
		return "FoodCat{" +
		       "id=" + id +
		       '}';
	}
}
