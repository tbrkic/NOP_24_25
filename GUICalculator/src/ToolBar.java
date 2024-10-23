import javax.swing.*;

public class ToolBar extends JPanel {
	private JButton saveAsTxt;
	private JButton saveObject;
	private JButton loadText;
	private JButton loadObject;
	private JButton clearAll;
	
	public ToolBar(){
		initComps();
		layoutComps();
		activateToolBar();
	}
	
	private void activateToolBar ( ) {
		this.saveAsTxt=new JButton ( "Save As Text" );
		this.clearAll=new JButton ("Clear All");
		this.saveObject=new JButton ("Save as Object");
		this.loadObject=new JButton ("Load Object");
		this.loadText=new JButton ("Load Text");
		
	}
	
	private void layoutComps ( ) { }
	
	private void initComps ( ) { }
	
	
}
