package View;
import java.sql.SQLException;

import Journal.AfficherMessage;
import Journal.Ecran;
import Journal.EnrichirMessage;
import Journal.Fichier;
import Journal.IJournal;
import Repository.EtudiantRepository;
import Repository.UniversiteRepository;
import Services.EtudiantService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        IJournal ecran=new Ecran();
        IJournal fichier=new Fichier("C:\\Users\\TRETEC\\Desktop\\TP2_Archit\\Log.txt");
        IJournal enrichirmessage=new EnrichirMessage(fichier,);
        IJournal affichermessage=new AfficherMessage(ecran,fichier);
        
		EtudiantRepository IEtudiantRep=new EtudiantRepository();
		UniversiteRepository IUniversityRep =new UniversiteRepository();
		EtudiantService serv=new EtudiantService(IEtudiantRep,IUniversityRep,);
		
		
		/*try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
