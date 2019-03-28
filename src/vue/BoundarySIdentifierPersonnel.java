package vue;

import control.ControlSIdentifier;
import model.ProfilUtilisateur;

public class BoundarySIdentifierPersonnel {

	private ControlSIdentifier control;
	Clavier clavier = new Clavier();
	
	public BoundarySIdentifierPersonnel(ControlSIdentifier controlSIdentifier) {
		this.control=controlSIdentifier;
	}

	public int identifierPersonnel() {
		 System.out.println("Veuillez entrer votre login");
		 String login = clavier.entrerClavierString();
		 System.out.println("Veuillez entrer votre mot de passe");
		 String mdp = clavier.entrerClavierString();
		 return control.sIdentifier(ProfilUtilisateur.PERSONNEL,login, mdp); 
	}

	
}
