package control;

import model.BDClient;
import model.BDPersonnel;
import model.ProfilUtilisateur;

public class ControlSIdentifier {

	private BDClient bdClient = BDClient.getInstance();
	private BDPersonnel bdPersonnel = BDPersonnel.getInstance();

	public int sIdentifier(ProfilUtilisateur client, String login, String mdp) {
		int numProfil = -1;
		switch (client) {
		case CLIENT:
			numProfil = bdClient.connecterClient(login, mdp);
			break;
		default:
			numProfil = bdPersonnel.connecterPersonnel(login, mdp);
			break;
		}
		return numProfil;
	}

	public String visualiserBDUtilisateur() {
		return (bdPersonnel + "\n" + bdClient);
	}

}
