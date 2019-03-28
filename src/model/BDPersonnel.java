package model;

import java.util.HashMap;
import java.util.Map;

public class BDPersonnel {
	
	private Map<Integer, Personnel>listePersonnel = new HashMap<>();
	private static BDPersonnel INSTANCE = null;
	
	public void ajouterPersonnel(Personnel perso) {
		listePersonnel.put(listePersonnel.size(), perso);
	}
	
	@Override
	public String toString() {
		return "BDPersonnel [listePersonnel=" + listePersonnel + "]";
	}

	public static BDPersonnel getInstance() {
		if (INSTANCE==null) {
			INSTANCE = new BDPersonnel();
		}
		return INSTANCE;
	}

	public int connecterPersonnel(String login, String mdp) {
		int numConnexion = -1;
		for (Map.Entry<Integer, Personnel> entry : listePersonnel.entrySet()) {
			Integer numPersonnel = entry.getKey();
			Personnel personnel = entry.getValue();
			if (personnel.selectionnerProfil(login, mdp)) {
				personnel.connecterProfil();
				numConnexion = numPersonnel;
			}
		}
		return numConnexion;
	}
	
	public Personnel selectionnerPersonnel(int numProfil) {
		return this.listePersonnel.get(numProfil);
	}
}
