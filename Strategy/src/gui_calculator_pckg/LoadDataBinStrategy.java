package gui_calculator_pckg;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import javax.swing.*;

import static gui_calculator_pckg.MainFrame.viewPanel;

public class LoadDataBinStrategy implements LoadDataStrategy{
    @Override
    public void loadDataFromFile( JFileChooser jFileChooser ){
        File file = new File( String.valueOf ( jFileChooser ) );
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // Clear JTextArea
            viewPanel.clearAll();
            viewPanel.clearListOfObjects();

            // Read objects from the file
            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof CalculationFormObjects) {
                    CalculationFormObjects fo = new CalculationFormObjects(((CalculationFormObjects) obj).getFst(), ((CalculationFormObjects) obj).getSnd(), ((CalculationFormObjects) obj).getResult(), ((CalculationFormObjects) obj).getCalStrat());
                    CalculationFormData calculationRecord = new CalculationFormData(fo.getFst(), fo.getSnd(), fo.getResult(), fo.getCalStrat());
                    viewPanel.addTextToViewPanel(calculationRecord);
                    viewPanel.addRecordToList(calculationRecord);
                }
            }
        } catch (EOFException ex) {
            // End of file reached; do nothing
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
