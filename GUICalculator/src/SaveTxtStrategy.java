import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SaveTxtStrategy implements SaveDataStrategy<String>{

	
	@Override
	public void saveDataToFile ( String filePath , List data ) throws IOException {
		   try(BufferedWriter bw = new BufferedWriter ( new FileWriter ( new File ( filePath ) ) ))  {
			   for( Object element : data){
				   bw.write ( element.toString () );
				   
			   }
		   }
	}
}
