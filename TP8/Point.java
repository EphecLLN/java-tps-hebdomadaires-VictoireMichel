/**
 * 
 */
package TP8;

/**
 * @author Victoire
 *
 */
public class Point extends Shape{
	
	public Point(int absisse, int ordonnee) {
		super(absisse, ordonnee);
	}
	
	public String toString() {
		return super.toString();
	}
	
	
	public double surface() {
		return 0;
	}
	
	public double perimetre() {
		return 0;
	}
	
	
	public void affiche() {
		System.out.println(toString());
	}
	
	public void deplace(int deltaX, int deltaY) {
		this.absisse = deltaX;
		this.ordonnee = deltaY;
	}
	
	public void agrandit(int facteur) {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape point = new Point(5,7);
		Shape point1 = new Point(5,7);
		point.affiche();
		point1.affiche();
		
	}

}
