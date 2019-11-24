/**
 * 
 */
package TP8;

/**
 * @author Victoire
 *
 */
public class Cercle extends Shape{
	
	double rayon;
	double pi = 3.14;

	
	public Cercle(int absisse, int ordonnee, double rayon) {
		super(absisse, ordonnee);
		this.rayon = rayon;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public double surface(){
		return Math.pow(rayon, 2.00) * pi;
	}
	
	public double perimetre() {
		return rayon * 2 * pi;
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
	public void deplace(int deltaX, int deltaY) {
		this.absisse = deltaX;
		this.ordonnee = deltaY;
	}
	
	public void agrandit(int facteur) {
		this.rayon = facteur;
		affiche();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape cercle = new Cercle(3,4,3);
		Shape cercle1 = new Cercle(6,7,8);
		cercle.affiche();
		cercle1.affiche();
		cercle.agrandit(5);

	}

}
