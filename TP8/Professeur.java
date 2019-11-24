/**
 * 
 */
package TP8;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Victoire
 *
 */
public class Professeur extends Personne {
	
	LocalDate curd = super.currentDate;
	
	public Professeur(String nom, String prenom, LocalDate dateNaiss, LocalDate dateArr) {
		super(nom, prenom, dateNaiss, dateArr);
	}
	
	public int anciennete() {
		return Period.between(dateArr, curd).getYears();
	}


	public void affiche() {
		System.out.println(toString());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne prof = new Professeur("aa", "bb", LocalDate.parse("1990-01-01"), LocalDate.parse("2010-05-15"));
		prof.affiche();	

	}

}
