package Gestion_bibliotheques;

import java.time.LocalDate;

public class Membre extends Personne {
	private LocalDate datInscription;

	// Get and Set
	public LocalDate getDatInscription() {
		return datInscription;
	}
	public void setDatInscription(LocalDate datInscription) {
		this.datInscription = datInscription;
	}
	
	//CONSTRUCTEUR
	public Membre (String nom, String prenom, String adresse, String datInscription) {
		super(nom, prenom, adresse);
		this.datInscription = LocalDate.parse(datInscription);
	}
	
	
	//Méthodes
	public String toString() {
		return "Membre [nom="+super.getNom()+",prenom="+super.getPrenom()+", adresse = "+super.getAdresse()+", datInscription=" + datInscription + "]";
	}

	
}

