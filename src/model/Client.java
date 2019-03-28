package model;
import java.util.ArrayList;
import java.util.List;

public class Client extends Profil {
	private List<Commande> commandes = new ArrayList<Commande>();
	
	public Client(String nom, String prenom, String mdp) {
		super(nom, prenom, mdp);
	}

	public String getNom()
	{
	        return nom;
	}
 
	public String getPrenom()
	{
	        return prenom;
	}
		
	public void ajouterCommande(Commande commande) {
		getCommandes().add(commande);	
	}
	
	public void afficherCommande(ArrayList<Commande> c) {
	    for (@SuppressWarnings("unused") Commande commandes : getCommandes()) {
	    	System.out.println(c);
	    }
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Client [" + super.toString() + ", commandes=" + commandes + "]";
	}
}
