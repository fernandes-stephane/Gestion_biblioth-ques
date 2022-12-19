package Gestion_bibliotheques;

public class Bibliotheque {
	private String ville;
	private int capaciteVisiteurs;
	private int capaciteItems;
	
	// Get and Set
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCapaciteVisiteurs() {
		return capaciteVisiteurs;
	}
	public void setCapaciteVisiteurs(int capaciteVisiteurs) {
		this.capaciteVisiteurs = capaciteVisiteurs;
	}
	public int getCapaciteItems() {
		return capaciteItems;
	}
	public void setCapaciteItems(int capaciteItems) {
		this.capaciteItems = capaciteItems;
	}
	
	//  CONSTRUCTEURS
	public Bibliotheque() {
		this.ville ="";
		this.capaciteVisiteurs = 0;
		this.capaciteItems = 0;
	}

}