package Gestion_bibliotheques;

import java.time.LocalDate;

public class Disque extends Item {
	private String interprete;
	private LocalDate dateDeSortie;
	
	// Get and Set
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public LocalDate getDateDeSortie() {
		return dateDeSortie;
	}
	public void setDateDeSortie(LocalDate dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}
	
	//CONSTRUCTEUR
	public Disque (String titre, String reference, String interprete, String dateDeSortie ) {
		super(titre, reference);
		this.interprete =interprete;
		this.dateDeSortie = LocalDate.parse(dateDeSortie);
	}
	
	
	//Méthodes
	public String toString() {
		return "Disque [titre="+ super.getTitre()+",reference="+ super.getReference()+",interprete=" + interprete + ", dateDeSortie=" + dateDeSortie+"]";
	}
	
}