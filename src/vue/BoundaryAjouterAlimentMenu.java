package vue;

import control.ControlAjouterAlimentMenu;

public class BoundaryAjouterAlimentMenu {

	private ControlAjouterAlimentMenu controlAjouterAlimentMenu;
	String nom;
	
	public BoundaryAjouterAlimentMenu(ControlAjouterAlimentMenu controlAjouterAlimentCarte) {
		this.controlAjouterAlimentMenu = controlAjouterAlimentCarte;
	}
	
	public void ajouterAlimentMenu() {
		int choix=0;
		boolean entreeCorrecte = false;
		do {
			System.out.println("1. ajouter un hamburger");
			System.out.println("2. ajouter des bonnes frites sa mère");
			System.out.println("3. ajouter une boisson");
			choix = Clavier.entrerClavierInt();
			entreeCorrecte = (choix == 1 || choix ==2 || choix ==3);
				if (!entreeCorrecte) {
					System.out.println("Veuillez entrer 1, 2 ou 3.");
			}
		} while (!entreeCorrecte);
		System.out.println("Veuillez entrer le nom de l'aliment.");
		nom = Clavier.entrerClavierString();
		switch(choix) {
		case 1 :
			controlAjouterAlimentMenu.ajouterHamburger(nom);
			break;
		
		case 2 :
			controlAjouterAlimentMenu.ajouterAccompagnement(nom);
			break;
		
		case 3 :
			controlAjouterAlimentMenu.ajouterBoisson(nom);
			break;
		
		default:
			System.out.println("Type d'aliment non reconnu.");
			break;
		}
	}
}
