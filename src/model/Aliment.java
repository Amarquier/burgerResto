package model;

public abstract class Aliment {

	@Override
	public String toString() {
		return "Aliment [nom=" + nom + "]";
	}

	private String nom;
	
	public Aliment(String Nom) {
		this.nom=Nom;
	}
	
	public String getNom()
	{
	        return nom;
	}
}
