package gui_calculator_pckg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveBinStrategy implements SaveDataStrategy<CalculationFormObjects> {
    @Override
    public void saveDataToFile(String filePath, List<CalculationFormObjects> data) {

        File file = new File(filePath);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(CalculationFormObjects obj : data) {
                oos.writeObject(obj);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
