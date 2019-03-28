package vue;

import control.ControlCreerProfil;
import model.ProfilUtilisateur;

public class BoundaryCreerProfilClient {
	
	String nom;
	String prenom;
	String mdp;
	private ControlCreerProfil creer;
	ProfilUtilisateur client = ProfilUtilisateur.CLIENT;

	
	public BoundaryCreerProfilClient(ControlCreerProfil profil) {
		this.creer = profil;
	}
	
	public void creerProfilClient() {
		System.out.println("Veuillez entrer votre nom");
		nom = Clavier.entrerClavierString();
		System.out.println("Veuillez entrer votre prenom");
		prenom = Clavier.entrerClavierString();
		System.out.println("Veuillez entrer votre mdp");
		mdp = Clavier.entrerClavierString();
		creer.creerProfil(client, this.nom, this.prenom, this.mdp);
	}
}