package Gestion_bibliotheques;

public class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	
	// Get and Set
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	// Constructeurs
	
	//CONSTRUCTEUR
		public Personne (String nom, String prenom, String adresse) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
		}
}