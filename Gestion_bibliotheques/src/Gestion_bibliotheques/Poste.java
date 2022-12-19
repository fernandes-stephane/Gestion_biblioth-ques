package Gestion_bibliotheques;

public class Poste {
	private String intitule;
	
	

	// Get and Set
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	// Constructeur
	public Poste(String intitule) {
		super();
		this.intitule = intitule;
	}

	//Méthode
	public String toString() {
		return "Poste [intitule=" + intitule + "]";
	}
}
	
	
	

