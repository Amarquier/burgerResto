package model;

import java.util.HashMap;
import java.util.Map;

public class BDClient {

	private Map<Integer, Client> listeClient = new HashMap<>();
	private static BDClient INSTANCE = null;

	@Override
	public String toString() {
		return "BDClient [listeClient=" + listeClient + "]";
	}

	public void ajouterClient(Client client) {
		listeClient.put(listeClient.size(), client);

	}

	public static BDClient getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new BDClient();
		}
		return INSTANCE;
	}

	public int connecterClient(String login, String mdp) {
		int numConnexion = -1;
		for (Map.Entry<Integer, Client> entry : listeClient.entrySet()) {
			Integer numClient = entry.getKey();
			Client client = entry.getValue();
			if (client.selectionnerProfil(login, mdp)) {
				client.connecterProfil();
				numConnexion = numClient;
			}
		}
		return numConnexion;
	}
	
	public Client selectionnerClient(int numProfil) {
		return this.listeClient.get(numProfil);
	}
}
