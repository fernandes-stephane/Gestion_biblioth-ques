package Gestion_bibliotheques;

import java.util.LinkedList;
import java.util.Scanner;

public class Ville {
	private String nom;
	private String departement;
	// instancie un tableau vide
	public static LinkedList<String> listNomVille = new LinkedList<String>();
	
	
	//Get & Set
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	//Constructeur
	public Ville(String nom, String departement) {	
		while (this.listNomVille.contains(nom)) {
			System.out.println("\nNOM DE VILLE DEJA EXISTANT: Entrez un autre nom:");
			Scanner newNom = new Scanner(System.in);
			nom = newNom.nextLine();
		}
		this.nom = nom;
		this.listNomVille.add(nom);
		this.departement = departement;
	}
}
