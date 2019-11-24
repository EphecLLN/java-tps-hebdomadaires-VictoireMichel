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
	 * m�thode abstraite
	 * 
	 */
	public abstract double surface();
	
	/**
	 *m�thode abstraite 
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
				+ "coordonn�es : " +"(" + absisse + " , " + ordonnee + ")" + "\n" 
				+ "p�rim�tre : " +  perimetre() + "\n" 
				+ "surface : " + surface() + "\n";
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
