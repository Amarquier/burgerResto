package model;

public class Personnel extends Profil {

	private boolean gerant = false;
	
	public Personnel(String nom, String prenom, String mdp) {
		super(nom, prenom, mdp);
	}
	
	@Override
	public String toString() {
		return "Personnel [gerant=" + gerant +", " + super.toString() + "]";
	}
	public boolean isGerant() {
		return this.gerant;
	}
	public void definirGerant() {
		this.gerant = true;
	}
}
