package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		/*{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		• {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		• Créer un tableau qui contient la somme des 2 précédents tableaux. 
		Effectuez un contrôle afin de ne calculer le tableau résultant que si les 2 tableaux initiaux sont de taille identique.*/
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] sumArrays = new int[array1.length];
		for (int x = 0; x < sumArrays.length; x++) {
			sumArrays[x] = array1[x] + array2[x];
		}
		
		// affichage du tableau 
		for (int x : sumArrays) 
			System.out.println(x);
		
	}

}
