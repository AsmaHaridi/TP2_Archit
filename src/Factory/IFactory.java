package Factory;
import Entity.Etudiant;

public interface IFactory {
       Etudiant creer (int matricule, String nom,String prenom,String email,String pwd,int id_university);
}
