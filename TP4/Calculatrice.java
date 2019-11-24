/**
 * 
 */
package TP4;

/**
 * @author Victoire
 *
 */
public class Calculatrice {

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valeurCourante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculatrice other = (Calculatrice) obj;
		if (Double.doubleToLongBits(valeurCourante) != Double.doubleToLongBits(other.valeurCourante))
			return false;
		return true;
	}
	
	/*
	public int compareTo(Calculatrice c) {
		if(equals()<c.equals()) {
			return -1;
		}
		if(equals()>c.equals()) {
			return 1;
		}
		return 0;
	}
	*/


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
