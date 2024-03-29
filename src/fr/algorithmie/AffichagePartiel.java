package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		/*
		 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7,
		 * -1, 17, 2, 3, 0, 14, -4} ;
		 */

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// affichage des entiers supérieurs à 3 du tableau
		System.out.println("ENTIERS > 3 DU TABLEAU :");
		for (int i : array) {
			if (i > 3) 
				System.out.println(i);}
				System.out.println("----------------------------");
		
		// affichage des entiers pairs
		System.out.println("ENTIERS PAIRS DU TABLEAU :");
		for (int i : array) {
			if (i % 2 == 0) 
				System.out.println(i);}
				System.out.println("----------------------------");
		
		// affichage des valeurs pour les index pairs
		System.out.println("ENTIERS POUR LES INDEX PAIRS :");
		for (int i = 0; i < array.length; i = i + 2) {
			System.out.println(array[i]);}
			System.out.println("----------------------------");
		
		// affichage des entiers impairs
		System.out.println("ENTIERS IMPAIRS :");
		for (int i : array) 
			if (i % 2 != 0) 
				System.out.println(i);
				
	}

}
