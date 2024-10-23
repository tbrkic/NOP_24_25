import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class FormPanel extends JPanel {
	private JTextField fstNumber;
	private JTextField sndNumber;
	private JTextField result;
	private JComboBox<CalculationStrategy> operation;
	private JButton confirm;
	public FormPanel(){
		Dimension dims=this.getPreferredSize ();
		
		Border outer = BorderFactory.createEmptyBorder ( 5 , 5 , 5 , 5 );
		Border inner = BorderFactory.createTitledBorder ( "Calculation panel: " );
		Border border = BorderFactory.createCompoundBorder (outer,inner);
		setBorder ( border );
		initComps();
		layoutComps();
		activateFormPanel();
	}
	
	private void initComps ( ) {
		fstNumber = new JTextField ();
		sndNumber = new JTextField ();
		result=new JTextField ();
		operation=new JComboBox<> ();
		DefaultComboBoxModel<CalculationStrategy> operationModel = new DefaultComboBoxModel<> ();
		operationModel.addElement (new AddCalcStrategy () );
		operationModel.addElement ( new MulCalcStrategy() );
		operationModel.addElement ( new DivCalcStrategy() );
		operationModel.addElement ( new SubCalcStrategy() );
		operation.setModel ( operationModel );
		operation.setSelectedIndex ( -1 );
		confirm=new JButton ();
		setLayout (new GridBagLayout ());
		GridBagConstraints gbc = new GridBagConstraints (  );
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.anchor=GridBagConstraints.FIRST_LINE_END;
		add(new JLabel ( "First number: " ), gbc);
		
		gbc.gridx++;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		add(fstNumber, gbc);
		
		gbc.gridx=0;
		gbc.gridy++;
		
		add(Box.createVerticalStrut ( 15 ),gbc);
		
		gbc.gridy++;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		add(sndNumber, gbc);
		
		gbc.gridx++;
		add(Box.createHorizontalStrut ( 25 ),gbc);
		
		gbc.anchor=GridBagConstraints.FIRST_LINE_END;
		add(new JLabel ( "Select operation: " ), gbc);
		add(operation, gbc);
		
		gbc.gridx=0;
		gbc.gridy++;
		add(Box.createVerticalStrut ( 20 ),gbc);
		gbc.gridy++;
		add(confirm, gbc);
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		add(result, gbc);
		
	}
	
	private void layoutComps ( ) {
		setLayout ( new BorderLayout (  ) );
		fstNumber=new JTextField ();
		sndNumber=new JTextField ();
		
	}
	
	private void activateFormPanel ( ) { }
}
