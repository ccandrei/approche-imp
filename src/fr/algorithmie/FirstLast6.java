package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		/*On calcule une valeur booléenne qui contrôle le tableau de la sorte :
			o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
			o elle vaut false dans les autres cas
		• écrire l’algo de valorisation de cette variable avec le minimum de ligne
		• Livrez votre code avec un tableau d’entiers quelconques rendant un résultat positif.*/
	

			int[] array = new int[9];
			boolean isMatchingArray = false;

			if (array.length >= 1) {
				if (array[0] == array[array.length - 1]) {
					isMatchingArray = true;
				}
			}
			// displays result
			System.out.println(isMatchingArray);
	
	}

}
