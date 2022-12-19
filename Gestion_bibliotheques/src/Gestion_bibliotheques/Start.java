package Gestion_bibliotheques;

import java.time.LocalDate;
import java.util.LinkedList;

public class Start {
	// Méthode main: porte d'entrée de notre application
	public static void main(String[] args) {
		
		
		//Villes
		Ville bordeaux = new Ville("bordeaux", "33");
		Ville lyon= new Ville("lyon", "69");
		Ville marseille= new Ville("marseille", "13");
		Ville paris= new Ville("paris", "75");
		Ville toulon= new Ville("toulon", "83");
		Ville toulouse= new Ville("toulouse", "31");
		Ville montpellier =new Ville("montpellier","34");
		
		//Bibliothèques
		Bibliotheque chateauRoux = new Bibliotheque(bordeaux, 10, 200);
		Bibliotheque griffonDor = new Bibliotheque(lyon, 45,600);
		Bibliotheque vivreEnsemble = new Bibliotheque(paris, 50, 500);
		Bibliotheque poudlar = new Bibliotheque(montpellier,200,1000);
		
		// Poste
		Poste agent = new Poste("Agent");
		Poste chef = new Poste("Chef");
		Poste manager= new Poste("Manager");
		Poste chefAdjoint= new Poste("chefAdjoint");
		Poste employePolyvalant= new Poste("Employé Polyvalant");
		
			
		// Item ( livre+disque)
		Livre firstLivre = new Livre("Hello", "aabbee", "Jean", "2016-08-16", "manu");
		System.out.println(firstLivre.getReference()+" "+ firstLivre.getAuteur());
		
		Livre livre2 = new Livre("bonjour le peuple", "jeib45j", "Albert", "2009-10-20", "manu");
		Livre livre3 = new Livre("le regret du chagrin", "bre43b2", "Francis", "2019-05-25", "Auchanis");
		Livre livre4 = new Livre("Pourquoi moi", "hrk43kk2","Charles", "2000-12-18", "Auchanis");
		Livre livre5 = new Livre("Qui suis-je?", "jijy2jh","Marie","2022-07-06","Gaillard");
		Livre livre6 = new Livre("Grossière erreur", "hgurj45j", "Charles", "2001-11-22", "Gaillard");
		Livre livre7 = new Livre("Admire derrière l'arbre", "fdop34oj", "Marie", "1999-03-21", "Malimard");
		Livre livre8 = new Livre("La vérité mensongère", "ghsuq34", "Jean-Claude", "2007-10-29", "Malimard");
		Livre livre9 = new Livre("Triste coincidense", "trus32jh", "Urus", "2009-12-12", "manu");
		Livre livre10 = new Livre("Fraiche Aventure", "heo32ohg", "Jean-Claude", "1997-06-28", "Auchanis");
		
		
		Disque firstDisque = new Disque("Hola", "eijur5gj", "Jacque", "2009-01-20");
		System.out.println(firstDisque.getTitre()+" "+firstDisque.getDateDeSortie());
		
		Disque disque2 = new Disque("Brume d'hiver", "ehsu43j", "Pierre", "2001-12-30");
		Disque disque3 = new Disque("Vive la pluie", "hgdds32", "Melanie", "1997-11-21");
		Disque disque4 = new Disque("Inside", "jir21jfi", "Mino", "2006-04-30");
		Disque disque5 = new Disque("Outside", "jeurhfi3", "Mino", "1999-08-12");
		Disque disque6 = new Disque("Reculons Ensemble", "4jehr3j", "Pierre", "2012-09-29");
		Disque disque7 = new Disque("Pivot", "urh432jj", "Melanie", "2008-01-21");
		Disque disque8 = new Disque("Gentil Humain", "gfj345j", "Richard", "2020-10-20");
		Disque disque9 = new Disque("Maman a peur", "heir321jh", "Pierre", "1996-12-08");
		Disque disque10 = new Disque("ABC", "heirh3421", "Richard", "2010-04-14");
		
		
		// Employes
		Employe employe1 = new Employe("Dupont","Martin", "20 rue albert", "2010-10-10", "4500", "menage", chef);
		Employe employe2 = new Employe("Laville","Sylvain", "10 rue des champs", "2010-10-21", "2000", "dev", agent);
		Employe employe3 = new Employe("Moon", "Hilarie", "3 rue des prairies", "2010-01-30", "2030", "dev", manager);
		Employe employe4 = new Employe("Plantul", "Rodrigue", "44 rue de la pierre", "2001-12-23", "1500", "dev", employePolyvalant);
		Employe employe5 = new Employe("Hilaire", "Monique", "53 rue de la chance", "1999-03-21", "2000", "menage", agent);
		Employe employe6 = new Employe("Moamie", "Marcel","4 rue de la paix", "2004-02-19", "4600", "dev", chef);
		Employe employe7 = new Employe("Ging", "Jennifer", "564 rue de la peche", "2022-03-23", "1500", "dev", employePolyvalant);
		Employe employe8 = new Employe("Jaune", "Paul", "32 rue du pain", "2020-05-12", "1500", "menage", employePolyvalant);
		Employe employe9 = new Employe("Mouti", "Frederique", "12 rue de la pierre","2007-10-12", "2030", "menage", manager);
		Employe employe10 = new Employe("Froussin", "Mali", "32 rue du castord", "2000-07-12", "1500", "dev", employePolyvalant);
		Employe employe11 = new Employe("Moino", "Pierrot", "21 rue du General", "2010-08-10", "2000", "menage", agent);
		Employe employe12 = new Employe("Piro", "Charles","45 rue du Salut", "2003-09-29","4500", "menage", chef);
		Employe employe13 = new Employe("Pi", "Tanya", "34 rue du potiron", "2004-10-12", "2030", "menage", manager);
		Employe employe14 = new Employe("Linon", "Patricia", "2 rue du taur", "2001-12-10", "1500", "menage",employePolyvalant);
		Employe employe15 = new Employe("Zoldick", "Benoit", "34 rue du colonel", "2017-09-15", "2000", "menage", agent);
		Employe employe16 = new Employe("Nino", "Jordan", "345 rue pastel", "2001-11-26", "4600", "dev", chef);
		Employe employe17 = new Employe("Houx", "Annik", "2 rue du coucou", "1997-10-10", "2040", "dev", manager);
		Employe employe18 = new Employe("Cotisse", "Gregoire", "34 rue du rochet","2002-12-05", "2003" , "dev", agent);
		Employe employe19 = new Employe("Lyton", "Marcus", "90 rue du peché", "2010-10-21", "1500","dev", employePolyvalant);
		Employe employe20 = new Employe("Miracle", "Armen", "30 rue des miracles", "2003-07-12", "1500", "dev", employePolyvalant);
		
		// Membre
		Membre membre1 = new Membre("Mouin", "Toc","3 impasse du bouret", "2002-10-23");
		Membre membre2 = new Membre("Rouge", "Francine", "2 rue du pieux", "2010-12-03");
		Membre membre3 = new Membre("Molette", "Pierre", "45 rue de l'abricot", "2004-09-10");
		Membre membre4 = new Membre("Richie", "Richard", "1 impasse à l'envers", "2001-07-22");
		Membre membre5 = new Membre("Goultard", "Henriette", "43 rue de l'or", "2019-07-15");
		
		
		// BIBLIOTHEQUE CHATEAU ROUX
		
		//Employe
		chateauRoux.addEmploye(employe1);
		chateauRoux.addEmploye(employe2);
		chateauRoux.addEmploye(employe3);
		chateauRoux.addEmploye(employe4);
		chateauRoux.addEmploye(employe5);
		chateauRoux.addEmploye(employe6);
		chateauRoux.addEmploye(employe7);
		chateauRoux.addEmploye(employe8);
		chateauRoux.addEmploye(employe9);
		chateauRoux.addEmploye(employe10);
		
		//Item
		chateauRoux.addItem(firstLivre);
		chateauRoux.addItem(livre2);
		chateauRoux.addItem(livre3);
		chateauRoux.addItem(livre4);
		chateauRoux.addItem(livre5);
		chateauRoux.addItem(disque2);
		chateauRoux.addItem(disque3);
		chateauRoux.addItem(disque4);
		chateauRoux.addItem(disque5);
		chateauRoux.addItem(firstDisque);
		
		//Membre
		chateauRoux.addMembre(membre1);
		chateauRoux.addMembre(membre3);
		chateauRoux.addMembre(membre5);
		
		System.out.println(chateauRoux.getListEmploye());
		
		//BIBLIOTHEQUE GRIFFONDOR
		
		//Employes
		griffonDor.addEmploye(employe11);
		griffonDor.addEmploye(employe12);
		griffonDor.addEmploye(employe13);
		griffonDor.addEmploye(employe14);
		griffonDor.addEmploye(employe15);
		griffonDor.addEmploye(employe16);
		griffonDor.addEmploye(employe17);
		griffonDor.addEmploye(employe18);
		griffonDor.addEmploye(employe19);
		griffonDor.addEmploye(employe20);
		
		//Items
		griffonDor.addItem(livre6);
		griffonDor.addItem(livre7);
		griffonDor.addItem(livre8);
		griffonDor.addItem(livre9);
		griffonDor.addItem(livre10);
		griffonDor.addItem(disque6);
		griffonDor.addItem(disque7);
		griffonDor.addItem(disque8);
		griffonDor.addItem(disque9);
		griffonDor.addItem(disque10);
		
		//Membres
		griffonDor.addMembre(membre2);
		griffonDor.addMembre(membre4);
		
		
		
		/*LinkedList<Employe> mzlist = firstBiblio.getListEmploye();
		System.out.println(mzlist.size());
		
		for (int i = 0; i < mzlist.size(); i++) {
			System.out.println(mzlist[i]);*/
		//}
			
	}
}