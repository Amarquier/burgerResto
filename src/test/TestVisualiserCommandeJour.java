package test;

import control.ControlVisualiserCommandeJour;
import model.Accompagnement;
import model.BDCommande;
import model.Boisson;
import model.Hamburger;
import vue.BoundaryVisualiserCommandeJour;

public class TestVisualiserCommandeJour {
	public static void main(String[] args) {
		//Mise en place de l'environnement pour le test
		Hamburger cheeseBurger = new Hamburger("CheeseBurger");
		Hamburger maxiBurger = new Hamburger("MaxiBurger");
		Accompagnement accompagnement = new Accompagnement("Frites");
		Boisson boissonCoca = new Boisson("Coca");
		Boisson boissonOrange = new Boisson("Orange");
		
		//cas visualiser commande du jour
		ControlVisualiserCommandeJour controlVisualiserCommandeJour = new ControlVisualiserCommandeJour();
		new BoundaryVisualiserCommandeJour(controlVisualiserCommandeJour);
		
		//extrait cas commander
		BDCommande bdCommande = BDCommande.getInstance();
		bdCommande.enregistrerCommande(1, cheeseBurger, accompagnement, boissonCoca);
		bdCommande.enregistrerCommande(1, maxiBurger, accompagnement, boissonOrange);
		
		//Resultat du test
		//Commande n°1 : CheeseBurger, Frites, Coca
		//Commande n°2 : MaxiBurger, Frites, Orange
	}
}
