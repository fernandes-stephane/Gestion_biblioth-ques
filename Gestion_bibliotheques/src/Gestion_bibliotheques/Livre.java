package Gestion_bibliotheques;
import java.time.LocalDate;

public class Livre extends Item {
	private String auteur;
	private LocalDate dateDeParution;
	private String editeur;
	
	
	// Get and Set
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public LocalDate getDateDeParution() {
		return dateDeParution;
	}
	public void setDateDeParution(LocalDate dateDeParution) {
		this.dateDeParution = dateDeParution;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	
	//CONSTRUCTEUR
	public Livre (String titre, String reference, String auteur, String dateDeParution,  String editeur ) {
		super(titre, reference);
		this.auteur =auteur;
		
		this.dateDeParution = LocalDate.parse(dateDeParution);
		this.editeur = editeur;
	}
	
	
	
	//Méthodes
	public String toString() {
		return "Livre [titre="+ super.getTitre()+",reference="+ super.getReference()+", auteur=" + auteur + ", dateDeParution=" + dateDeParution + ", editeur=" + editeur + "]";
	}
	
}