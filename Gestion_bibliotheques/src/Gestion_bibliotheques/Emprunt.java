package Gestion_bibliotheques;


public class Emprunt {
	public class Disque {
		private String dateEmprunt;
		private String dateRetour;
		
		// Get and Set
		public String getDateEmprunt() {
			return dateEmprunt;
		}
		public void setDateEmprunt(String dateEmprunt) {
			this.dateEmprunt = dateEmprunt;
		}
		public String getDateRetour() {
			return dateRetour;
		}
		public void setDateRetour(String dateRetour) {
			this.dateRetour = dateRetour;
		}
	}
}
