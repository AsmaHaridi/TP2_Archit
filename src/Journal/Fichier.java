package Journal;
import java.io.IOException;
public class Fichier implements IJournal {

	private final Path path;
	
	public Fichier (String pathAsString) {
		path=Paths.get(pathAsString).toAbsolutePath();
	}
	public void log(String message) {
		Files.write(path,(message+"\n").getBytes());
	}
	
}
