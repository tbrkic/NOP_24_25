package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class ListCLS<T extends Number> {
	private final List <T> lst;
	public ListCLS(){
		this.lst=new ArrayList <> ();
	}
	public void addNewElement(T element){
		lst.add(element);
	}
	public void listAllElements(){
		for(T i : this.lst){
			System.out.println (i );
		}
	}
}
