/**
 * 
 */
package TP2;

/**
 * @author Victoire
 *
 */
public class Calculatrice {

private double valeurCourante;
	
	public Calculatrice(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	
	void ajoute(double n) {
		valeurCourante = valeurCourante + n;
	}
	
	void soustrait(double n) {
		valeurCourante = valeurCourante - n;
	}
	
	void carre() {
		valeurCourante *= valeurCourante;
	}
	
	public String toString() {
		return "Valeur affichée : " + valeurCourante;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatrice myCalc = new Calculatrice(6);
		//System.out.println(myCalc.valeurCourante);
		myCalc.ajoute(5);
		//System.out.println(myCalc.valeurCourante);
		myCalc.soustrait(2);
		//System.out.println(myCalc.valeurCourante);
		myCalc.carre();
		System.out.println(myCalc);
		
		
	}


	public double getValeurCourante() {
		return valeurCourante;
	}


	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

}
