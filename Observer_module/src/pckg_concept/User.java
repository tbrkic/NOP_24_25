package pckg_concept;

public class User implements ServiceSignIn{
	private int id;
	private static int cntID;
	private String userName;
	private String passwd;
	public User(String userName, String passwd){
		this.userName=userName;
		this.passwd=passwd;
		id=cntID++;
	}
	
	@Override
	public String toString ( ) {
		return "User{" +
		       "id=" + id +
		       ", userName='" + userName + '\'' +
		       '}';
	}
	
	@Override
	public void provideSignInInfo ( String userName , String passwd ) {
		System.out.println (userName );
		System.out.println (passwd );
	}
}
