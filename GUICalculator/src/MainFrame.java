import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	private ViewPanel viewPanel;
	private FormPanel formPanel;
	private ToolBar toolBar;
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
	
	private void activateMainframe ( ) {
		                                               formPanel.setFormPanelListener ( new FormPanelListener ( ) {
			                                               @Override
			                                               public void formPanelEventOccured ( CalculationFormData formRecord ) {
				                                                viewPanel.addText ( formRecord.toString () );
			                                               }
		                                               } );
	}
	
	private void LayoutComps ( ) {
		setLayout ( new BorderLayout (  ) );
		add(viewPanel,BorderLayout.CENTER);
		add(formPanel,BorderLayout.SOUTH);
		add(toolBar, BorderLayout.NORTH);
	}
	
	private void initComps ( ) {
		viewPanel=new ViewPanel ();
		formPanel=new FormPanel ();
		
	}
	
	
}
