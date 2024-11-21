package pckg_command_pattern.pckg_zad1;

public class Food {
	double price;
	int id;
	int cnt=1;
	public Food(FoodName foodName, double price){
		this.price=price;
		this.id=cnt++;
	}
}
