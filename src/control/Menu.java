package control;

import java.util.ArrayList;
import model.Accompagnement;
import model.Boisson;
import model.Hamburger;

public class Menu {

	private ArrayList<Hamburger> ListeHamburger = new ArrayList<>();	
	private ArrayList<Boisson> ListeBoissons = new ArrayList<>();
	private ArrayList<Accompagnement> ListeAccompagnement = new ArrayList<>();

	public void ajouterAliment(Hamburger hamburger) {
		 ListeHamburger.add(hamburger);
	}
	
	public void ajouterAliment(Accompagnement accompagnement) {
		 ListeAccompagnement.add(accompagnement);
	}	
	
	public void ajouterAliment(Boisson boisson) {
		 ListeBoissons.add(boisson);
	}
	
	private static Menu INSTANCE = null;
	
	public static Menu getInstance() {
		if (INSTANCE==null) {
			INSTANCE = new Menu();
		}
		return INSTANCE;
	}

}
