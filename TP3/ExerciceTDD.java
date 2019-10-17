/**
 * 
 */
package TP3;

/**
 * @author Victoire
 *
 */
public class ExerciceTDD {
	
	/**
	 * méthode qui vérifie si un nombre est pair
	 * 
	 * @param n
	 * @return true ou false
	 */
	public boolean estPair(int n) {
		if(n%2 == 0) {
			return true;
		}
		else {return false;
		}
	}
	
	/**
	 * méthode qui calcule le périmètre d'un coté en fonction de la longueur d'un coté passé en paramètre
	 * @param n
	 * @return un integer
	 */
	public int perimetreCarre(int n) {
		return n*4;
	}
	
	/**
	 * méthode qui prend le premier paramètre et vérifie s'il est dans le second.
	 * @param caractere
	 * @param chaine
	 * @return le nombre de fois que le caractère se trouve dans la chaîne.
	 */
	public int estDedans(char caractere , String chaine) {
		int compteur = 0;
		for (int i = 0; i < chaine.length(); i++) {
			if(chaine.charAt(i) == caractere){
				compteur++;
			}
		}
		return compteur;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
