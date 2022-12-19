package Gestion_bibliotheques;

import java.time.LocalDate;
import java.util.LinkedList;

public class Start {
	// Méthode main: porte d'entrée de notre application
	public static void main(String[] args) {
		
		
		//Villes
		Ville ville1= new Ville("toulon", "250");
		Ville ville2= new Ville("toulouse", "31");
		//Bibliothèques
		Bibliotheque chateauRoux = new Bibliotheque(ville1, 10, 200);
		
		Bibliotheque VivreEnsemble = new Bibliotheque(ville2, 50, 500);
		
		// Poste
		Poste agent = new Poste("Agent");
		Poste chef = new Poste("Chef");
		
		
		// Item ( livre+disque)
		Livre firstLivre = new Livre("hello", "aabbee", "jean", "2016-08-16", "manu");
		System.out.println(firstLivre.getReference()+" "+ firstLivre.getAuteur());
		
		
		Disque firstDisque = new Disque("hola", "eijur5gj", "jacque", "2009-01-20");
		System.out.println(firstDisque.getTitre()+" "+firstDisque.getDateDeSortie());
		
		
		// Employes
		Employe Employe1 = new Employe("Dupont","Martin", "20rue albert", "2010-10-10", "1000", "menage", chef);
		Employe Employe2 = new Employe("Laville","Sylvain", "10 rue des champs", "2010-10-21", "2000", "dev", agent);
		
		// Première Bibliotheque
		chateauRoux.addEmploye(Employe1);
		chateauRoux.addEmploye(Employe2);
		System.out.println(chateauRoux.getListEmploye());
		
		
		/*LinkedList<Employe> mzlist = firstBiblio.getListEmploye();
		System.out.println(mzlist.size());
		
		for (int i = 0; i < mzlist.size(); i++) {
			System.out.println(mzlist[i]);*/
		//}
			
	}
}