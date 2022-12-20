package Gestion_bibliotheques;
import java.util.*;

public class Bibliotheque {
	private String nom;
	private Ville ville;
	private int capaciteVisiteurs; //  A verifiez avec le client.
	private int capaciteItems; //  A verifiez avec le client.
	// private Employe[] listEmploye;
	// private Item[] tabItem;
	private LinkedList<Employe> listEmploye;
	private LinkedList<Item> listItem;
	private LinkedList<Membre> listMembre;
	
	// instancie un tableau vide
	public static LinkedList<Ville> listVille = new LinkedList<Ville>();
	
	
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
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public void addEmploye(Employe employe) {
		// Limite d'insertions dans la liste employé.
		if (this.listEmploye.size()>=100) {
			System.out.println("Vous ne pouvez pas inserer plus d'employé");
		} else {
			this.listEmploye.add(employe);
		}	
	}
	
	
	public void addItem(Livre livre) {
		// Limite d'insertions dans la liste Item.
		if (this.listItem.size()>=this.capaciteItems) {
			System.out.println("Vous ne pouvez pas inserer plus de Livres");
		} else {
			this.listItem.add(livre);
		}
	}
	
	public void addItem(Disque disque) {
		// Limite d'insertions dans la liste Item.
		if (this.listItem.size()>=this.capaciteItems) {
			System.out.println("Vous ne pouvez pas inserer plus de Disques");
		} else {
			this.listItem.add(disque);
		}
	}
	
	public void addMembre(Membre membre) {
		this.listMembre.add(membre);
	}
	
	//  CONSTRUCTEURS
	public Bibliotheque(String nom, Ville ville, int capaciteVisiteur, int capaciteItem ) { //, Employe[] employe, ) {
		this.nom = nom;
		if (!this.listVille.contains(ville)) {
			this.ville = ville;
		} else {
			System.out.println("choisir ue autre ville");
		}
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
		this.listMembre = new LinkedList<Membre>();
		}
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
	

	public String toString() {
		return "Bibliotheque [nom="+ nom +", ville=" + ville + ", capaciteVisiteurs=" + capaciteVisiteurs + ", capaciteItems="
				+ capaciteItems + ", listEmploye=" + listEmploye + ", listItem=" + listItem + ", listMembre="
				+ listMembre + "]";
	}

	
	
	
	


}










