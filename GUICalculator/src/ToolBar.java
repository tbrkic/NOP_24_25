import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

public class ToolBar extends JPanel implements ActionListener {
	private JButton saveAsTxt;
	private JButton saveObject;
	private JButton loadText;
	private JButton loadObject;
	private JButton clearAll;
	private ToolBarListener toolBarListener;
	
	public ToolBar(){
		initComps();
		layoutComps();
		activateToolBar();
	}
	
	private void activateToolBar ( ) {
		saveAsTxt.addActionListener ( this );
		saveAsTxt.setActionCommand ( "Save TXT" );
		saveObject.addActionListener ( this );
		saveObject.setActionCommand ( "Save BIN" );
		loadText.addActionListener ( this );
		loadText.setActionCommand ( "Load TXT" );
		loadObject.addActionListener ( this );
		loadObject.setActionCommand ( "Load BIN" );
		clearAll.addActionListener ( this );
		clearAll.setActionCommand ( "Clear all" );
	}
	
	private void layoutComps ( ) {
		setLayout ( new FlowLayout ( FlowLayout.LEFT ) );
		add ( saveAsTxt );
		add ( saveObject );
		add ( loadText );
		add ( loadObject );
		add ( clearAll );}
	
	private void initComps ( ) {
		this.saveAsTxt = new JButton ( "Save As Text" );
		this.clearAll = new JButton ( "Clear All" );
		this.saveObject = new JButton ( "Save as Object" );
		this.loadObject = new JButton ( "Load Object" );
		this.loadText = new JButton ( "Load Text" );
	}
	
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e
	 * 		the event to be processed
	 */
	@Override
	public void actionPerformed ( ActionEvent ae ) {
	 ViewPanel viewPanel=new ViewPanel ();
		if ( ae.getActionCommand ( ).equals ( "Save TXT" ) ) {
			// Get text from JTextArea
			String text = viewPanel.getText ( );
			// Split text by new lines and convert it to a List
			List textList = ( List ) Arrays.asList ( text.split ( "\\r?\\n" ) );
			SaveTxtStrategy sts = new SaveTxtStrategy ( );
			try {
				sts.saveDataToFile ( "ListOfText" , ( java.util.List ) textList );
			}
			catch ( IOException e ) {
				throw new RuntimeException ( e );
			}
			
		}
		else if ( ae.getActionCommand ( ).equals ( "Save BIN" ) ) {
			SaveDataStrategy sbs = new SaveDataStrategy ( );
			List < CalculationFormData > list = viewPanel.getListOfObjects ( );
			List < CalculationFormObjects > list2 = new ArrayList <> ( );
			for ( CalculationFormData cfd : list ) {
				CalculationFormObjects cfo = new CalculationFormObjects ( cfd.fst ( ) , cfd.snd ( ) , cfd.result ( ) , cfd.calStrat ( ) );
				list2.add ( cfo );
			}
			sbs.saveDataToFile ( "NOP-vjezbe/Strategy/src/gui_calculator_pckg/ListOfObjects.bin" , list2 );
			
		}
		else if ( ae.getActionCommand ( ).equals ( "Load TXT" ) ) {
			LoadDataTxtStrategy ldts = new LoadDataTxtStrategy ( );
			ldts.loadDataFromFile ( "NOP-vjezbe/Strategy/src/gui_calculator_pckg/ListOfText" , viewPanel.getListOfObjects ( ) );
			
		}
		else if ( ae.getActionCommand ( ).equals ( "Load BIN" ) ) {
			LoadDataBinStrategy ldbs = new LoadDataBinStrategy ( );
			ldbs.loadDataFromFile ( "NOP-vjezbe/Strategy/src/gui_calculator_pckg/ListOfObjects.bin" , viewPanel.getListOfObjects ( ) );
			
		}
		else if ( ae.getActionCommand ( ).equals ( "Clear all" ) ) {
			viewPanel.clearAll ( );
		}
	
	}
}
