package Gestion_bibliotheques;


public class Livre {
	private String auteur;
	private String dateDeParution;
	private String editeur;
	
	// Get and Set
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getDateDeParution() {
		return dateDeParution;
	}
	public void setDateDeParution(String dateDeParution) {
		this.dateDeParution = dateDeParution;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
}