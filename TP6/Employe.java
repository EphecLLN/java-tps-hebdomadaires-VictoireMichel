/**
 * 
 */
package TP6;

/**
 * @author Victoire
 *
 */
public class Employe extends Personne{
	
	int salaire;
	String employeur;
	
	public Employe(String nom, String prenom, int numRegNat, int salaire, String employeur) {
		super(nom,prenom,numRegNat);
		this.salaire = salaire;
		this.employeur = employeur;
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"salaire : " + salaire + "\n" +
				"employeur : " + employeur ;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String [] args){
		
		Personne emp = new Employe("Jules", "Dupont", 123234, 1500, "EPHEC");
		System.out.println(emp);
		
		}

}
