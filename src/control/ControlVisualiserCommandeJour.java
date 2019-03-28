package control;
import java.util.Observer;

import model.BDCommande;

public class ControlVisualiserCommandeJour {
	
	private BDCommande bdCommande = BDCommande.getInstance();
	
	@SuppressWarnings("unused")
	public void setObserver(Observer vue) {
		bdCommande.addObserver(vue);
	}
}
