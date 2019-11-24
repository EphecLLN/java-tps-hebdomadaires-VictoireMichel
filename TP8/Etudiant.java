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
public class Etudiant extends Personne {
	
	LocalDate curd = super.currentDate;


	
	public Etudiant(String nom, String prenom, LocalDate dateNaiss, LocalDate dateArr) {
		super(nom, prenom, dateNaiss, dateArr);
	}
	
	public int anciennete() {
		return Period.between(dateArr, curd).getYears();
	}
	
	public String matricule() {
		return dateArr.getYear() + nom.substring(0,1) + prenom.substring(0,1);
	}
	
	public String toString() {
		return super.toString() + " matricule : " + matricule();
	}

	public void affiche() {
		System.out.println(toString());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne etu = new Etudiant("Al", "Fo", LocalDate.parse("1996-05-03"), LocalDate.parse("2017-09-01"));
		etu.affiche();

	}

}
