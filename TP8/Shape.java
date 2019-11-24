/**
 * 
 */
package TP8;

/**
 * @author Victoire
 *
 */
public abstract class Shape implements Affichable, Transformable{

	static int svar = 0;
	int id;
	int absisse, ordonnee;
	
	
	/**
	 * méthode abstraite
	 * 
	 */
	public abstract double surface();
	
	/**
	 *méthode abstraite 
	 *
	 */
	public abstract double perimetre();

	/**
	 * 
	 *@return Renvoit le nom de la forme suivie de son identifiant
	 */
	public String getNom() {
		return (getClass().getSimpleName()) + "-" + id;
	}
	
	public Shape(int absisse, int ordonnee) {
		this.id = svar;
		this.absisse = absisse;
		this.ordonnee = ordonnee;
		svar ++;
	}
	
	public String toString() {
		return getNom() + " " + "\n" 
				+ "coordonnées : " +"(" + absisse + " , " + ordonnee + ")" + "\n" 
				+ "périmètre : " +  perimetre() + "\n" 
				+ "surface : " + surface() + "\n";
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
