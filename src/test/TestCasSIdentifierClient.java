package test;

import control.ControlCreerProfil;
import control.ControlSIdentifier;
import model.ProfilUtilisateur;
import vue.BoundarySIdentifierClient;

public class TestCasSIdentifierClient {

	public static void main(String[] args) {
		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil();
		controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, "Dupond", "Hector", "cdh");

		// Initialisation controleur du cas & cas Inclus/etendu
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier();
		// Initialisation vue du casHe
		BoundarySIdentifierClient boundarySIdentifierClient = new BoundarySIdentifierClient(controlSIdentifier);
		// Lancement du cas
		int numClient = boundarySIdentifierClient.identifierClient();

		// Verification de la bonne realisation du cas
		System.out.println("VERIFICATION");
		System.out.println("numero du client = " + numClient);
		System.out.println(controlSIdentifier.visualiserBDUtilisateur());

		// Resultat du test
		// Veuillez entrer votre login
		// Hector.Dupond
		// Veuillez entrer votre mot de passe
		// cdh
		// VERIFICATION
		// numero du client = 0
		// BDPersonnel [listePersonnel={}]
		// BDClient [listeClient={0=Client [nom=Dupond, prenom=Hector, login=Hector.Dupond, mdp=cdh, connecte=true]}]
	}
}
