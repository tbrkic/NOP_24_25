package gui_calculator_pckg;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class MainFrame extends JFrame {

    static ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    private List <String> txtData;
    private ToolBarListener toolBarListener;

    public MainFrame() {

        super("Simple calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(CalculationFormData formRecord) {
                viewPanel.addTextToViewPanel(formRecord);
                txtData.add ( formRecord.toString () );
            }
        });
        toolBar.setToolBarListener ( new ToolBarListener ( ) {
            @Override
            public void toolBarEventOccured ( String buttonActionString ) {
                if(buttonActionString.equals ( "SAVE TXT" )){
                    SaveTxtStrategy saveTxtStrategy=new SaveTxtStrategy ();
                    saveTxtStrategy.saveDataToFile ( "DataTXT.txt",txtData );
                }   else if(buttonActionString.equals ( "Clear all" )){
                 txtData.clear ();
                    viewPanel.clearAll ();
                    JOptionPane.showMessageDialog ( this,"List has been cleared!!!" );
                } else if(buttonActionString.equals ( "Load text" )){
                    LoadDataTxtStrategy loadDataTxtStrategy=new LoadDataTxtStrategy ();
                    loadDataTxtStrategy.loadDataFromFile ( "DataTXT.txt", );
                }
                
            }
        } );
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void initComps() {

        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
    }
}
