package control;

import model.BDClient;
import model.BDPersonnel;
import model.ProfilUtilisateur;

public class ControlVerifierIdentification {

	private BDClient bdClient = BDClient.getInstance();
	private BDPersonnel bdPersonnel = BDPersonnel.getInstance();

	public boolean verifierIdentification(ProfilUtilisateur profilUtilisateur, int numProfil) {
		boolean connexionOK = false;
		switch (profilUtilisateur) {
		case CLIENT:
			bdClient.selectionnerClient(numProfil);
			if (bdClient.selectionnerClient(numProfil) != null) {
				connexionOK = bdClient.selectionnerClient(numProfil).isConnecte();
			} 

		case PERSONNEL:
			bdPersonnel.selectionnerPersonnel(numProfil);
			if (bdPersonnel.selectionnerPersonnel(numProfil) != null) {
				connexionOK = bdPersonnel.selectionnerPersonnel(numProfil).isConnecte();
			}
		default:
			bdPersonnel.selectionnerPersonnel(numProfil);
			if (bdPersonnel.selectionnerPersonnel(numProfil) != null) {
				if (bdPersonnel.selectionnerPersonnel(numProfil).isGerant() == true) {
					connexionOK = bdPersonnel.selectionnerPersonnel(numProfil).isConnecte();
				} 
			}
		}
		return connexionOK;
	}
}
