/**
 * 
 */
package TP6;

/**
 * @author Victoire
 *
 */
public class Independant extends Personne{
	
	String numTva;

	public Independant(String nom, String prenom, int numRegNat, String numTva) {
		super(nom,prenom,numRegNat);
		this.numTva= numTva;
	}
	
	public String toString() {
		return super.toString() + "\n" + "numéro de TVA : " + numTva;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne ind = new Independant("Jules", "Dupont", 123234, "BE0123456789");
		System.out.println(ind);
	}

}
