package vue;

import control.ControlSIdentifier;
import model.ProfilUtilisateur;

public class BoundarySIdentifierClient {

	private ControlSIdentifier control;
	Clavier clavier = new Clavier();
	
	public BoundarySIdentifierClient(ControlSIdentifier controlSIdentifier) {
		this.control=controlSIdentifier;
	}

	public int identifierClient() {
		 System.out.println("Veuillez entrer votre login");
		 String login = clavier.entrerClavierString();
		 System.out.println("Veuillez entrer votre mot de passe");
		 String mdp = clavier.entrerClavierString();
		 return control.sIdentifier(ProfilUtilisateur.CLIENT,login, mdp); 
	}

	
}
