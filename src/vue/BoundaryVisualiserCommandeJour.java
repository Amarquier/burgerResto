package vue;

import java.util.Observable;
import java.util.Observer;

import control.ControlVisualiserCommandeJour;
import model.BDCommande;

public class BoundaryVisualiserCommandeJour implements Observer {

	private ControlVisualiserCommandeJour control;
	
	public BoundaryVisualiserCommandeJour(ControlVisualiserCommandeJour control) {
		control.setObserver(this);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof BDCommande) {
			if (arg1 instanceof String && arg1.equals("vider écran")) {
				System.out.println("Ecran effacé");
			} else if (arg1 instanceof String[]) {
				String[] label = (String[]) arg1;
				int numAffichage = Integer.parseInt(label[0]);
				switch (numAffichage) {
				case 1:
					String numeroCommande = label[1];
					String hamburger = label[2];
					String accompagnement = label[3];
					String boisson = label[4];
					Fichier.ecrire("Commande n°" + numeroCommande + ", " + hamburger + ", " + accompagnement + ", " +boisson);
					break;

				default:
					System.out.println("Numéro d'affichage non reconnu");
					break;
				}
			}else
				System.out.println("Type de message inconnu");
		} else
			System.out.println("Objet emetteur inconnue");
	}
}