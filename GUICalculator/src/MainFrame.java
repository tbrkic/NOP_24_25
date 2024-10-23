import javax.swing.*;

public class MainFrame extends JFrame {
	private ViewPanel viewPanel;
	private FormPanel formPanel;
	public MainFrame(){
		super ( "Basic GUI Calculator" );
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		setResizable (false );
	setLocationRelativeTo ( null );
	setSize ( 680,570);
	setVisible ( true );
	
	initComps();
	LayoutComps();
	activateMainframe();
	}
	
	private void activateMainframe ( ) { }
	
	private void LayoutComps ( ) { }
	
	private void initComps ( ) {
		viewPanel=new ViewPanel ();
		formPanel=new FormPanel ();
		
	}
	
	
}
