/**
 * 
 */
package TP8;

/**
 * @author Victoire
 *
 */
public class Carre extends Shape implements Affichable, Transformable{
	
	double cote;
	
	public Carre(int absisse, int ordonnee, double cote) {
		super(absisse,  ordonnee);
		this.cote = cote;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public double surface() {
		return cote * cote;
	}
	
	public double perimetre() {
		return cote * 4;
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
	public void deplace(int deltaX, int deltaY) {
		this.absisse = deltaX;
		this.ordonnee = deltaY;
	}
	
	public void agrandit(int facteur) {
		this.cote = facteur;
		affiche();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape carre = new Carre(6,5,8);
		Shape carre1 = new Carre(4,2,9);
		carre.affiche();
		carre1.affiche();
		carre.agrandit(14);

	}

}
