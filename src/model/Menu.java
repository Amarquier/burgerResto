package model;

import java.util.ArrayList;

public class Menu {

	private ArrayList<Hamburger> ListeHamburger = new ArrayList<>();	
	private ArrayList<Boisson> ListeBoissons = new ArrayList<>();
	private ArrayList<Accompagnement> ListeAccompagnement = new ArrayList<>();

	public void ajouterAliment(Hamburger hamburger) {
		 ListeHamburger.add(hamburger);
	}
	
	@Override
	public String toString() {
		return "Menu [ListeHamburger=" + ListeHamburger + ", ListeBoissons=" + ListeBoissons + ", ListeAccompagnement="
				+ ListeAccompagnement + "]";
	}

	public void ajouterAliment(Accompagnement accompagnement) {
		 ListeAccompagnement.add(accompagnement);
	}	
	
	public void ajouterAliment(Boisson boisson) {
		 ListeBoissons.add(boisson);
	}

}
