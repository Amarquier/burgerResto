package model;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class BDCommande extends Observable {

	private Map<Integer, Commande>mapCommandes = new HashMap<>();
	
	private static BDCommande INSTANCE = null;
	
	private BDCommande() {
	}
	
	public static BDCommande getInstance() {
		if (INSTANCE==null) {
			INSTANCE = new BDCommande();
		}
		return INSTANCE;
	}
	
	public void ajouterCommande(Commande commande){
		int numeroCommande = mapCommandes.size()+1;
		mapCommandes.put(numeroCommande, commande);
	}
	
	public void supprimerCommande (Integer numeroCommande) {
		mapCommandes.remove(numeroCommande);
	}

	public void viderCommandesJour() {
		mapCommandes.clear();
		setChanged();
		String action = "vider écran";
		notifyObservers(action);
	}
	
	public void afficherCommande() {
		for (Commande commande : mapCommandes.values()) {
			System.out.println(commande);
		}
	}

	public int enregistrerCommande(int numClient, Hamburger hamburger, Accompagnement accompagnement, Boisson boisson ) {
		Commande commande = new Commande(numClient, hamburger, accompagnement, boisson);
		commande.getNumeroAttribue();
		setChanged();
		String[] label = new String[5];
		label[0]="1";
		label[1]=String.valueOf(commande.getNumeroAttribue());
		label[2]=hamburger.getNom();
		label[3]=accompagnement.getNom();
		label[4]=boisson.getNom();
		notifyObservers(label);
		return commande.getNumeroAttribue();
	}
		
	@Override
	public String toString() {
		return "BDCommande [mapCommandes=" + mapCommandes + "]";
	}
}
