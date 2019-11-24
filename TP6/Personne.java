	/**
 * 
 */
package TP6;

/**
 * @author Victoire
 *
 */
public class Personne {
	
	public String nom, prenom;
	public int numRegNat;
	
	public Personne(String nom, String prenom, int numRegNat) {
		this.nom = nom;
		this.prenom = prenom;
		this.numRegNat = numRegNat;
	}
	
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if(other.nom==null && this.nom!=null)
			return false;
		if(!other.nom.equals(this.nom))
	        return false;
	    if(other.prenom==null && this.prenom!=null)
	        return false;
	    if(!other.prenom.equals(this.prenom))
	        return false;
	    
	    if(other.numRegNat != this.numRegNat)
	        return false;
	    return true;
	}
	
	public String toString() {
		String s = this.nom + " " + this.prenom + " " + this.numRegNat;
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne("Jules", "Dupont", 123234);
		System.out.println(pers);
	}

}
