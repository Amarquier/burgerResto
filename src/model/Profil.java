package model;

public abstract class Profil {
	
	String nom;
	String prenom;
	String mdp;
	String login;
	boolean connecte = false;
	
	public Profil(String nom, String prenom, String mdp) {
		this.nom =nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.login = prenom + "."+nom;
	}	
	
	public boolean selectionnerProfil(String login, String mdp) {
		 boolean isClient = (this.login.equals(login) && this.mdp.equals(mdp));
		 return isClient;
	}

	public void connecterProfil() {
		this.connecte = true;
	}
	
	public boolean isConnecte() {
		return this.connecte;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", login=" + login + ", connecte="
				+ connecte;
	} 
	
	
	
}
