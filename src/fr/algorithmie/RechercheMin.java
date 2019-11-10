package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		/*
		 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 */

		// Rechercher le plus petit élément du tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int minNumber = Integer.MAX_VALUE;
		for (int i : array)
			if (i < minNumber)
				minNumber = i;

		System.out.println("Le plus petit élément est : \n" + minNumber);
	}
}
