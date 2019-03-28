package control;

import model.Accompagnement;
import model.Boisson;
import model.Hamburger;

public class ControlAjouterAlimentMenu {
	
	private Menu menu = Menu.getInstance();
	
	public void ajouterHamburger(String nom) {
		Hamburger steakhouse = new Hamburger(nom);
		menu.ajouterAliment(steakhouse);
	}
	
	
	public void ajouterAccompagnement(String nom) {
		Accompagnement frites = new Accompagnement(nom);
		menu.ajouterAliment(frites);
	}
	
	public void ajouterBoisson(String nom) {
		Boisson orangina = new Boisson(nom);
		menu.ajouterAliment(orangina);
	}
}
