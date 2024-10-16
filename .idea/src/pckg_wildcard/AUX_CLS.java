package pckg_wildcard;

import java.util.List;

public class AUX_CLS {
	public static void processNamesInList(List<? extends User> lst){
		for ( User user : lst ){
			System.out.println ("Name is: "+user.getName() );
		}
	}
//	public static void addSomeUser(List<? extends  User> lst,User user){
//	lst.add ( user );
//	}
	public static void addNewUser(List<? super User> users){
		users.add(new User ( "Nikolina" ));
	}
	public static < T extends User> void processList ( List<T> lst, T newElement ){
		for(T element : lst){
			System.out.println (element );
		}
		lst.add ( newElement );
	}
}
