package Gestion_bibliotheques;
import java.util.*;

public class Bibliotheque {
	private Ville ville;
	private int capaciteVisiteurs;
	private int capaciteItems;
	// private Employe[] listEmploye;
	// private Item[] tabItem;
	private LinkedList<Employe> listEmploye;
	private LinkedList<Item> listItem;
	
	// instancie un tableau vide
	public static LinkedList<Ville> listVille = new LinkedList<Ville>();;
	
	
	// Get and Set
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public int getCapaciteVisiteurs() {
		return capaciteVisiteurs;
	}
	public void setCapaciteVisiteurs(int capaciteVisiteurs) {
		this.capaciteVisiteurs = capaciteVisiteurs;
	}
	public int getCapaciteItems() {
		return capaciteItems;
	}
	public void setCapaciteItems(int capaciteItems) {
		this.capaciteItems = capaciteItems;
	}

	public LinkedList<Employe> getListEmploye() {
		return listEmploye;
	}
	public void setListEmploye(LinkedList<Employe> listEmploye) {
		this.listEmploye = listEmploye;
	}
	public LinkedList<Item> getListItem() {
		return listItem;
	}
	public void setListItem(LinkedList<Item> listItem) {
		this.listItem = listItem;
	}
	
	public void addEmploye(Employe employe) { 
		this.listEmploye.add(employe);
	}
	
	//  CONSTRUCTEURS
	public Bibliotheque(Ville ville, int capaciteVisiteur, int capaciteItem ) { //, Employe[] employe, ) {
		if (!this.listVille.contains(ville)) {
			this.ville = ville;
		} else {
			System.out.println("choisir ue autre ville");
		}
		
		this.ville =ville;
		if (capaciteVisiteur>30 && capaciteVisiteur<250 ) {
			this.capaciteVisiteurs = capaciteVisiteur;
		} else {
			this.capaciteVisiteurs= 30;
		}
		if (capaciteItems>1000 && capaciteItems<150000 ) {
			this.capaciteItems = capaciteItem;
		} else {
			this.capaciteItems =1000;
		}
		
		this.listItem = new LinkedList<Item>();
		this.listEmploye = new LinkedList<Employe>();
		
		//Livre monLivre = new Livre("toto", "titi", "tutu", "2020-12-21", "tete");
//		listItem.add(monLivre);
		
		//listItem.add(new Livre("toto", "titi", "tutu", "2020-12-21", "tete"));
		
		
		//if (employe.length>10 && employe.length<100 ) {
		//	this.employe = employe;
		//}
		// this.employe = [];
		// this.listItem = new listItem[10];
		
		
		//listItem.add(Livre firstLivre);
		// listItem.contains(ville);
		//listItem
	
		
		
	// METHODE
	
	
	}

	
	
	
	


}










