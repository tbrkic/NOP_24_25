import java.io.IOException;
import java.util.List;

public interface SaveDataStrategy < E > {
 void saveDataToFile( String filePath, List <E> data ) throws IOException;
}
