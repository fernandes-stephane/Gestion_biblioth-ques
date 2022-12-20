package Gestion_bibliotheques;

import java.time.LocalDate;


public class Emprunt {
	private LocalDate dateEmprunt;
	private LocalDate dateRetour;
	// item
	private Item ItemEmprunt;
	// membre
	private Personne membreEmprunt;
	// biblio par liens
	private Bibliotheque biblioEmprunt;
	
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
	public Personne getMembreEmprunt() {
		return membreEmprunt;
	}
	public void setMembreEmprunt(Personne membreEmprunt) {
		this.membreEmprunt = membreEmprunt;
	}
	public Bibliotheque getBiblioEmprunt() {
		return biblioEmprunt;
	}
	public void setBiblioEmprunt(Bibliotheque biblioEmprunt) {
		this.biblioEmprunt = biblioEmprunt;
	}
	
	// CONSTRUCTEUR
	public Emprunt(String dateEmprunt, String dateRetour, Item itemEmprunt, Personne membreEmprunt//,
			//Bibliotheque biblioEmprunt) {
		) {
		this.dateEmprunt = LocalDate.parse(dateEmprunt);
		this.dateRetour = LocalDate.parse(dateRetour);
		this.ItemEmprunt = itemEmprunt;
		this.membreEmprunt = membreEmprunt;
		//this.biblioEmprunt = biblioEmprunt;
	}
	//l'item emprunté, le membre et la bibliothèque concernés.
	public String toString() {
		return "Disque [dateEmprunt=" + dateEmprunt + ", dateRetour=" + dateRetour +
				", ItemEmprunt ="+ItemEmprunt+", membreEmprunt ="+membreEmprunt+"]";
	}
	

}
