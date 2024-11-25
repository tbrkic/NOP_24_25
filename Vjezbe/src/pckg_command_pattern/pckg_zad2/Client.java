package pckg_command_pattern.pckg_zad2;

public class Client {
	public static void main ( String[] args ) {
		CheckingAccount account=new CheckingAccount ( "Bob",456 );
		DepositMoney depositMoney =new DepositMoney ( account, 456 );
		System.out.println (account);
	}
}
