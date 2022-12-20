package Gestion_bibliotheques;

public class Item {
	private String titre;
	private String reference;
	
	
	// Get and Set
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	//CONSTRUCTEUR
	public Item (String titre, String reference) {
		this.titre =titre;
		this.reference = reference;
	}

	//Méthode
		public String toString() {
		return "Item [titre=" + titre + ", reference=" + reference + "]";
	}
}
