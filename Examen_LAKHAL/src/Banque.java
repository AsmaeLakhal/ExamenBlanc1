import java.util.HashMap;

import src.Client;



/**
 * Cette classe représente une banque 
 * @author   HAFIDI IMAD
 */
public class Banque {
	/**
	 * Liste des clients, la clé est le numéro du client
	 */
	private HashMap<Integer, Client> mesClients;
	/**
	 * Nom de la banque
	 */
	private String nom;
	
	/**
	 * La méthode respecte les régles suivantes :
	 * 1-Le client ne doit pas exister 
	 * 2-Le numéro du client est généré automatiquement ( dernier numéro +1)
	 * @param nom
	 * @param age
	 * @param typeCompte
	 * @return false : si le client n'est pas ajouté
	 */
	public boolean addClient(String nom,String prenom, Integer age){
		
		Client client =new Client(nom,prenom,numero);
		client.setAge(age);
		if(!this.mesClients.containsValue(client)) {
			this.mesClients.put(numero, client);
			return true;
		}
		
		
		return false;
	}
	/**
	 * La méthode ajoute un compte et l'attribue à un client
	 * @param client
	 * @param typeCompte
	 * @return false : si le compte n'est pas crée
	 */
	public boolean addCompte(Client client, String typeCompte){
		//TODO
		return false;
	}
	/**
	 * La méthode supprime un client si seulement si le solde de tous ses comptes 
	 * est zéro
	 * @param client
	 * @return false si le client est supprimé
	 */
	public boolean removeClient(Client client) {
		//TODO
		return false;
	}
	/**
	 * Cette méthode affiche les relvés bancaires d'un client pour une date précise(05/14)
	 * @param id
	 */
	public void afficheTousComptesClient(Integer id, String mois, String année){
		//TODO
	}

}
