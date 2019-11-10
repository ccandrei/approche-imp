package fr.tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		
		/*Exercice 1

    Créer un package : « fr.tableaux »
    Créer une classe Exercice1
    déclarer un tableau d’entiers contenant tous les entiers de 1 à 10
    Afficher la longueur du tableau en utilisant la propriété length
    Afficher le premier élément du tableau
    Afficher le dernier élément du tableau en utilisant la propriété length
    à quel index est situé l’entier 5 ?
    Afficher l’élément d’index 10. Que se passe t’il ? Pourquoi ?
    Modifier la valeur de l’élément d’index 4 et donner lui la valeur 8.*/
		
		//déclarer un tableau d’entiers contenant tous les entiers de 1 à 10
		int [] tableau = {1,2,3,4,5,6,7,8,9,10};
		
		
		//Afficher la longueur du tableau en utilisant la propriété length
		System.out.println("la longueur du tableau est: " + tableau.length);
		
		//Afficher le premier élément du tableau
		System.out.println("1er élément est: " + tableau[0]);

		//Afficher le dernier élément du tableau en utilisant la propriété length
		System.out.println("dernier élément est: " + tableau[tableau.length-1]);
		
		//à quel index est situé l’entier 5 ?
		System.out.println("L'entier 5 est situé à l'index 4");
		
		//Afficher l’élément d’index 10. Que se passe t’il ? Pourquoi ?
		System.out.println("élément d'index 10: " + tableau[10]);
			
		//Modifier la valeur de l’élément d’index 4 et donner lui la valeur 8
		tableau[4] = 8;
		
		
		
		
		
		
		
		
	}

}
