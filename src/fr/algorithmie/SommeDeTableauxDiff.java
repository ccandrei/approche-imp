package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		/*{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		• {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		• Créer un tableau qui contient la somme des 2 précédents tableaux*/
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

		
		int grandeLongueurArray = array2.length;
		if (array1.length > array2.length) {
			grandeLongueurArray = array1.length;
		}
		
		int[] sumArrays = new int[grandeLongueurArray];
		for (int x = 0; x < array2.length; x++) {
			sumArrays[x] = array2[x]; 
		}
		for (int x = 0; x < array1.length; x++) {
			sumArrays[x] = sumArrays[x] + array1[x];
		}
		
		// affichage du tableau 
		for (int x : sumArrays) 
			System.out.println(x);

	}

}
