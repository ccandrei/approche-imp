package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		/*Soit le tableau suivant : 
		 * int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;*/
		
		//Rechercher le plus grand élément du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int maxNumber = Integer.MIN_VALUE;
		for (int i : array) 
			if (i > maxNumber) 
				maxNumber = i;
			
		
		System.out.println("Le plus grand élément est : \n" + maxNumber);
	}

}
