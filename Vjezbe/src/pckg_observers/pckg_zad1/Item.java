package pckg_observers.pckg_zad1;

public class Item {
	private String itemName;
	private String itemCat;
	
	public Item ( String itemName , String itemCat ) {
		this.itemName = itemName;
		this.itemCat = itemCat;
	}
	
	@Override
	public String toString ( ) {
		return "Item{" +
		       "itemName='" + itemName + '\'' +
		       ", itemCat='" + itemCat + '\'' +
		       '}';
	}
}
