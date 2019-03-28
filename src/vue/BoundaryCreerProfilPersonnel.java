package vue;

import control.ControlCreerProfil;
import model.ProfilUtilisateur;

public class BoundaryCreerProfilPersonnel {
	
	String nom;
	String prenom;
	String mdp;
	private ControlCreerProfil creer;
	ProfilUtilisateur personnel = ProfilUtilisateur.PERSONNEL;

	
	public BoundaryCreerProfilPersonnel(ControlCreerProfil profil) {
		this.creer = profil;
	}
	
	public void creerProfilPersonnel() {
		System.out.println("Veuillez entrer votre nom");
		nom = Clavier.entrerClavierString();
		System.out.println("Veuillez entrer votre prenom");
		prenom = Clavier.entrerClavierString();
		System.out.println("Veuillez entrer votre mdp");
		mdp = Clavier.entrerClavierString();
		creer.creerProfil(personnel, nom, prenom, mdp);
	}
}