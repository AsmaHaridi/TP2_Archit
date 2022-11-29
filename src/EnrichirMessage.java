
import java.text.SimpleDateFormat;
import java.util.Date;
public class EnrichirMessage implements IJournal {
 
	String laClasse;
	IJournal journal;
	
	public EnrichirMessage(IJournal journal,String laClasse) {
		journal= journal;
		this.laClasse=laClasse;
	}
	public void log(String message) {
		SimpleDateFormat DateFormat = new SimpleDateFormat();
		journal.log(DateFormat.format(new Date())+""+laClasse+""+message+"");
	}
}
