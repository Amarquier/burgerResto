package vue;

import control.ControlCreerProfil;
import model.ProfilUtilisateur;

public class BoundaryCreerProfilGerant {
	
	String nom;
	String prenom;
	String mdp;
	private ControlCreerProfil creer;
	ProfilUtilisateur gerant = ProfilUtilisateur.GERANT;

	
	public BoundaryCreerProfilGerant(ControlCreerProfil profil) {
		this.creer = profil;
	}
	
	public void creerProfilGerant() {
		System.out.println("Veuillez entrer votre nom");
		nom = Clavier.entrerClavierString();
		System.out.println("Veuillez entrer votre prenom");
		prenom = Clavier.entrerClavierString();
		System.out.println("Veuillez entrer votre mdp");
		mdp = Clavier.entrerClavierString();
		creer.creerProfil(gerant, nom, prenom, mdp);
	}
}