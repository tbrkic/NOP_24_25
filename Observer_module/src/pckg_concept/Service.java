package pckg_concept;

public class Service {
//	private User user;
	private ServiceSignIn serviceSignIn;
	private String serviceName;
	public Service(String serviceName){
		this.serviceName=serviceName;
	}
	public void signInToService(ServiceSignIn serviceSignIn){
		this.serviceSignIn=serviceSignIn;
		System.out.println ("Provide some info for sign in: "+serviceSignIn );
	}
}
