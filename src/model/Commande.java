package model;
public class Commande {

	static int nbCommande = 0;
	private int numClient;
	private static int numeroCommande;
	Hamburger hamburger;
	Accompagnement accompagnement;
	Boisson boisson;
	
	public Commande(int client, Hamburger hamburger, Accompagnement accompagnement, Boisson boisson) {
		Commande.nbCommande++;
		Commande.numeroCommande=Commande.nbCommande;
		this.numClient = client;
		this.hamburger = hamburger;
		this.accompagnement = accompagnement;
		this.boisson = boisson;
	}
	
	public int getNumeroAttribue()
	{
	        return numeroCommande;
	}
	
	@Override
	public String toString() {
		return "Commande [numClient=" + numClient + ", hamburger=" + hamburger + ", accompagnement=" + accompagnement
				+ ", boisson=" + boisson + "]";
	}
	
	public static void initialiseNumeroCommande(){
		 	numeroCommande = 0;
		}

}
