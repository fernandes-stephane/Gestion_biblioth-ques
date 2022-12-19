package Gestion_bibliotheques;

import java.time.LocalDate;

public class Employe extends Personne {
	private LocalDate datEmbauche;
	private String salaire;
	private String service;
	private Poste monPoste;
	
	// Get and Set
	public LocalDate getDatEmbauche() {
		return datEmbauche;
	}
	public void setDatEmbauche(LocalDate datEmbauche) {
		this.datEmbauche = datEmbauche;
	}
	public String getSalaire() {
		return salaire;
	}
	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	public Poste getMonPoste() {
		return monPoste;
	}
	public void setMonPoste(Poste monPoste) {
		this.monPoste = monPoste;
	}
	//CONSTRUCTEUR
	public Employe(String nom, String prenom, String adresse, String datEmbauche, String salaire, String service,
			Poste monPoste) {
		super(nom, prenom, adresse);
		this.datEmbauche = LocalDate.parse(datEmbauche);
		this.salaire = salaire;
		this.service = service;
		this.monPoste = monPoste;
	}
	
	
	
	
	//Méthode
	public String toString() {
		return "Employe [nom="+super.getNom()+",prenom="+super.getPrenom()+", datEmbauche=" + datEmbauche + ", salaire=" + salaire + ", service=" + service + ", monPoste="
				+ monPoste + "]";
	}
	
}