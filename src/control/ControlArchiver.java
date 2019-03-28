package control;

import model.BDCommande;
import vue.BoundaryVisualiserCommandeJour;

public class ControlArchiver {
	
	private BDCommande bdCommande = BDCommande.getInstance();
	
	public void archiver() {
		bdCommande.viderCommandesJour();
	}
	
	public void connectObserver(BoundaryVisualiserCommandeJour vue) {
		bdCommande.addObserver(vue);
	}
}
