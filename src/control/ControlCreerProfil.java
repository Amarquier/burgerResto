package control;


import model.BDClient;
import model.BDPersonnel;
import model.Client;
import model.ProfilUtilisateur;
import vue.Clavier;
import model.Personnel;


public class ControlCreerProfil {
	
	Clavier scan = new Clavier();
	private BDClient bdClient = BDClient.getInstance();
	private BDPersonnel bdPersonnel = BDPersonnel.getInstance();


	public void creerProfil(ProfilUtilisateur type, String nom, String prenom, String mdp) {

		switch(type) {
		case CLIENT :
			Client client = new Client(nom, prenom, mdp);
			bdClient.ajouterClient(client);
			break;
		
		case GERANT :
			Personnel gerant = new Personnel(nom, prenom, mdp);
			bdPersonnel.ajouterPersonnel(gerant);
			gerant.definirGerant();
			break;
		
		case PERSONNEL :
			Personnel personnel = new Personnel(nom, prenom, mdp);
			bdPersonnel.ajouterPersonnel(personnel);
			break;
			}
	}

	public String visualisationBDClient() {
		return (bdPersonnel+ "\n" + bdClient); 
	}
	
}
	