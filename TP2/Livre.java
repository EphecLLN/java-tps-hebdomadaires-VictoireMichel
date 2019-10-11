/**
 * 
 */
package TP2;

/**
 * @author Victoire
 *
 */
public class Livre {

private String titre, auteur, isbn;
	
	public Livre(String pTitre, String pAuteur, String pIsbn) {
		titre = pTitre;
		auteur = pAuteur;
		isbn = pIsbn;
	}
	
	public String toString() {
		String s = this.titre + " " + this.auteur + " " + this.isbn;
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre li = new Livre("Divergente", "V.R","02345");
		System.out.println(li);
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
