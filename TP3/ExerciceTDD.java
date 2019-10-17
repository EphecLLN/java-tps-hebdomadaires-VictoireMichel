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
	 * m�thode qui v�rifie si un nombre est pair
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
	 * m�thode qui calcule le p�rim�tre d'un cot� en fonction de la longueur d'un cot� pass� en param�tre
	 * @param n
	 * @return un integer
	 */
	public int perimetreCarre(int n) {
		return n*4;
	}
	
	/**
	 * m�thode qui prend le premier param�tre et v�rifie s'il est dans le second.
	 * @param caractere
	 * @param chaine
	 * @return le nombre de fois que le caract�re se trouve dans la cha�ne.
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
