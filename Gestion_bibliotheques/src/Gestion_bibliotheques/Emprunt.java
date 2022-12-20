package Gestion_bibliotheques;

import java.time.LocalDate;


public class Emprunt {
	private LocalDate dateEmprunt;
	private LocalDate dateRetour;
	// item
	private Item ItemEmprunt;
	// membre
	private String nomMembre;
	// biblio par liens
	private String nomBiblio;
	
	// Get and Set
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public LocalDate getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}
	public Item getItemEmprunt() {
		return ItemEmprunt;
	}
	public void setItemEmprunt(Item itemEmprunt) {
		ItemEmprunt = itemEmprunt;
	}
	public String getMembreEmprunt() {
		return nomMembre;
	}
	public void setMembreEmprunt(String membreEmprunt) {
		this.nomMembre = membreEmprunt;
	}
	public String getBiblioEmprunt() {
		return nomBiblio;
	}
	public void setBiblioEmprunt(String biblioEmprunt) {
		this.nomBiblio = biblioEmprunt;
	}
	
	// CONSTRUCTEUR
	public Emprunt(String dateEmprunt, String dateRetour, Item itemEmprunt, String nomMembre,
			String nomBiblio) {
		this.dateEmprunt = LocalDate.parse(dateEmprunt);
		this.dateRetour = LocalDate.parse(dateRetour);
		this.ItemEmprunt = itemEmprunt;
		this.nomMembre = nomMembre;
		this.nomBiblio = nomBiblio;
	}
	//l'item emprunté, le membre et la bibliothèque concernés.
	public String toString() {
		return "Disque [date Emprunt=" + dateEmprunt + ", date Retour=" + dateRetour +
				", Item Emprunté ="+ItemEmprunt+", Membre ="+nomMembre+", Bibliothèque ="+nomBiblio+" ]";
	}
	

}
