package gui_calculator_pckg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.*;

import static gui_calculator_pckg.MainFrame.viewPanel;

public class LoadDataTxtStrategy implements LoadDataStrategy{
    @Override
    public void loadDataFromFile( JFileChooser jFileChooser ) {
        File file = new File( String.valueOf ( jFileChooser ) );
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            viewPanel.read(reader, null); // Reads file content into JTextArea
            viewPanel.clearListOfObjects();
        } catch (IOException ex) {
             ex.printStackTrace();
        }
    }
}
