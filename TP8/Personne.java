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
public abstract class Personne implements Affichable{
	
	
	String nom, prenom;
	LocalDate dateNaiss; 
	LocalDate currentDate = LocalDate.now();
	LocalDate dateArr;
	
	public Personne(String nom, String prenom, LocalDate dateNaiss, LocalDate dateArr) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.dateArr = dateArr;
	}
	
	/**
	 *méthode abstraite 
	 *
	 */
	public abstract int anciennete();
	
	public int age(LocalDate dateNaiss, LocalDate currentDate){
		this.dateNaiss = dateNaiss;
		return Period.between(dateNaiss,currentDate).getYears();
	}
	
	public String toString() {
		return "nom : " + nom + "\n" + 
				"prénom : " + prenom + "\n" + 
				"ancienneté : " + anciennete() + "\n" + 
				"age : " + age(this.dateNaiss,currentDate);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
