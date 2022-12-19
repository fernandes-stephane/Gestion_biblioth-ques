package Gestion_bibliotheques;

public class Ville {
	private String nom;
	private String departement;
	
	
	//Get & Set
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	//Constructeur
	public Ville(String nom, String departement) {
		this.nom = nom;
		this.departement = departement;
	}

	
	
}
