package gui_calculator_pckg;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

import static gui_calculator_pckg.MainFrame.viewPanel;

public class ToolBar extends JPanel implements ActionListener {

    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;
    private ToolBarListener toolBarListener;

    public ToolBar() {

        initComps();
        layoutComps();
        activateToolBar();
    }

    private void initComps() {
        this.saveAsText = new JButton("Save txt");
        this.saveObjects = new JButton("Save bin");
        this.loadObjects = new JButton("Load bin");
        this.loadText = new JButton("Load txt");
        this.clearAll = new JButton("Clear all");
    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsText);
        add(saveObjects);
        add(loadText);
        add(loadObjects);
        add(clearAll);
    }

    private void activateToolBar() {
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("Save TXT");
        saveObjects.addActionListener(this);
        saveObjects.setActionCommand("Save BIN");
        loadText.addActionListener(this);
        loadText.setActionCommand("Load TXT");
        loadObjects.addActionListener(this);
        loadObjects.setActionCommand("Load BIN");
        clearAll.addActionListener(this);
        clearAll.setActionCommand("Clear all");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Get text from JTextArea
        String text = viewPanel.getText ( );
        // Split text by new lines and convert it to a List
        List < String > textList = Arrays.asList ( text.split ( "\\r?\\n" ) );
        if(toolBarListener!=null){
            toolBarListener.toolBarEventOccured ( saveAsText.getActionCommand () );
        }
        if (ae.getSource ()==saveAsText) {
            SaveTxtStrategy sts = new SaveTxtStrategy();
            sts.saveDataToFile("DATA/ListOfText.txt", textList);

        } else if (ae.getSource ()==saveObjects) {
            SaveBinStrategy sbs = new SaveBinStrategy();
            List<CalculationFormData> list = viewPanel.getListOfObjects();
            List<CalculationFormObjects> list2 = new ArrayList<>();
            for(CalculationFormData cfd : list) {
                CalculationFormObjects cfo = new CalculationFormObjects(cfd.fst(), cfd.snd(), cfd.result(), cfd.calStrat());
                list2.add(cfo);
            }
            sbs.saveDataToFile("DATA/ListOfObjects.bin", list2);

        } else if( ae.getSource ()==clearAll) {
            viewPanel.clearAll();
        }
        else if ( ae.getSource ()==loadText) {
            LoadDataTxtStrategy loadDataTxtStrategy = new LoadDataTxtStrategy ( );
            JFileChooser jFileChooser = new JFileChooser ("DATA");
            jFileChooser.showOpenDialog ( new JFrame (  ) );
            loadDataTxtStrategy.loadDataFromFile (jFileChooser.getSelectedFile () );
           if(viewPanel.getText ()!=""){ SaveTxtStrategy sts = new SaveTxtStrategy ( );
            sts.saveDataToFile ( "DATA/DataTXT.txt" , textList );}
        }
    }
    
    public void setToolBarListener ( ToolBarListener toolBarListener ) {
        this.toolBarListener = toolBarListener;
    }
}
