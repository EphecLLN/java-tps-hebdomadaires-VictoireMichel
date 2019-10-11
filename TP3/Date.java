/**
 * 
 */
package TP3;

/**
 * @author Victoire
 *
 */
public class Date {

private int jour, mois, annee;
	
	public Date(int pJour, int pMois, int pAnnee){
		jour = pJour;
		mois = pMois;
		annee = pAnnee;
	}
	
	public String toString() {
		String s = this.jour + "/" + this.mois + "/" + this.annee;
		return s;
	}
	/**
	 * fonction qui génère la date de naissance d'un étudiant
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date naissance = new Date(1,2,3);
		System.out.println(naissance.jour);
		System.out.println(naissance.mois);
		System.out.println(naissance.annee);
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
