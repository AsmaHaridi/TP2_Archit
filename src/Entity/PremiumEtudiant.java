package Entity;
public class PremiumEtudiant extends LimiteEtudiant {

	public PremiumEtudiant(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
		// TODO Auto-generated constructor stub
	}
    public void AjouterBonus() {
    	nbLivreMensuel_Autorise +=10;
    }
}
