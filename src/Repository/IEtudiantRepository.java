package Repository;
import java.util.ArrayList;

import Entity.Etudiant;
public interface IEtudiantRepository {

	void add(Etudiant E);
	boolean ExistNom(String nom);
	boolean ExistPrenom(String prenom);
	boolean ExistEmail(String email);
	boolean ExistMatricule(int matricule);
	ArrayList<EtudiantLimite> getAllEtudiant_Forfait_Limite();
}
