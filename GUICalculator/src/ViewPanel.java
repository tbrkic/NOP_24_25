import java.awt.*;
import javax.swing.*;

public class ViewPanel extends JPanel {
	private JTextArea textArea;
	private JScrollPane scrollPane;
	public  ViewPanel(){
		textArea = new JTextArea ();
		scrollPane = new JScrollPane (textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		LayoutManager BorderLayout = new BorderLayout ( );
		setLayout ( BorderLayout );
		add(textArea);
	}
	public void addText(String text){
		textArea.append ( text );
	}
}
