package test;

import control.ControlCreerProfil;
import control.ControlSIdentifier;
import model.ProfilUtilisateur;
import vue.BoundarySIdentifierPersonnel;

public class TestCasSIdentifierPersonnel {

	public static void main(String[] args) {

		// Mise en place de l'environnement
		ControlCreerProfil controlCreerProfil = new ControlCreerProfil();
		controlCreerProfil.creerProfil(ProfilUtilisateur.GERANT, "Martin",
				"Victor", "gmv");

		// Initialisation controleur du cas & cas Inclus/etendu
		ControlSIdentifier controlSIdentifier = new ControlSIdentifier();
		// Initialisation vue du cas
		BoundarySIdentifierPersonnel boundarySIdentifierPersonnel = new BoundarySIdentifierPersonnel(
				controlSIdentifier);
		// Lancement du cas
		int numPersonnel = boundarySIdentifierPersonnel.identifierPersonnel();

		// Verification de la bonne réalisation du cas
		System.out.println("VERIFICATION");
		System.out.println("numero du personnel = " + numPersonnel);
		System.out.println(controlSIdentifier.visualiserBDUtilisateur());

		// Resultat du test
		// Veuillez entrer votre login
		// Victor.Martin
		// Veuillez entrer votre mot de passe
		// gmv
		// VERIFICATION
		// numero du personnel = 0
		// BDPersonnel [listePersonnel={0=Personnel [gerant=true, nom=Martin,
		// prenom=Victor, login=Victor.Martin, mdp=gmv, connecte=true]}]
		// BDClient [listeClient={}]
	}
}
