/**
 * 
 */
package TP2;

/**
 * @author Victoire
 *
 */
public class Etudiant {

	private String nom, prenom;
	private int matricule;
	private Date dateNaissance;
	
	public Etudiant(String nom, String prenom, int matricule, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.dateNaissance = dateNaissance;
	}
	
	public String toString() {
		String s = this.nom + " " + this.prenom + " " + this.matricule + " " + this.dateNaissance;
		return s;
	}
	

	/**
	 * Méthode qui crée un nouvel objet Etudiant
	 * et qui lui affecte des propriétés
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant etu = new Etudiant("M","V",201705,new Date(19,06,1997));
		/*etu.nom = "M";
		System.out.println(etu.nom);
		etu.prenom = "V";
		System.out.println(etu.prenom);
		etu.matricule = 201705;
		System.out.println(etu.matricule);
		zetu.dateNaissance = new Date(19,6,1997);
		System.out.println(etu.dateNaissance);*/
		System.out.println(etu);
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
