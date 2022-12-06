package Journal;
public class AfficherMessage implements IJournal {

	IJournal journal1;
	IJournal journal2;
	
	public AfficherMessage(IJournal journal1 ,IJournal journal2) {
		this.journal1 =journal1;
		this.journal2=journal2;
	}
	
	public void log(String message) {
		journal1.log(message);
		journal2.log(message);
		
	}
}
