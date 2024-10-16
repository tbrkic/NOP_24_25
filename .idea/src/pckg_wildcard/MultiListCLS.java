package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS<E> {
private final List <E>someList;
public MultiListCLS(){
	this.someList=new ArrayList <> ();
}
public MultiListCLS(List<E> someList){
	this.someList=someList;
}

public void listAllElements(){
	if(this.someList.isEmpty ()){
		System.out.println ("List is empty!!!" );
	}else{
	for(E i : this.someList){
		System.out.println (i.toString () );
	}
}
}
public void compareTwoLists(List<?> anotherList){
	System.out.println (this.someList.size ()- anotherList.size ( ) );
}

}
