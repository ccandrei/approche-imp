package fr.tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		
		/*Exercice 1

    Cr�er un package : � fr.tableaux �
    Cr�er une classe Exercice1
    d�clarer un tableau d�entiers contenant tous les entiers de 1 � 10
    Afficher la longueur du tableau en utilisant la propri�t� length
    Afficher le premier �l�ment du tableau
    Afficher le dernier �l�ment du tableau en utilisant la propri�t� length
    � quel index est situ� l�entier 5 ?
    Afficher l��l�ment d�index 10. Que se passe t�il ? Pourquoi ?
    Modifier la valeur de l��l�ment d�index 4 et donner lui la valeur 8.*/
		
		//d�clarer un tableau d�entiers contenant tous les entiers de 1 � 10
		int [] tableau = {1,2,3,4,5,6,7,8,9,10};
		
		
		//Afficher la longueur du tableau en utilisant la propri�t� length
		System.out.println("la longueur du tableau est: " + tableau.length);
		
		//Afficher le premier �l�ment du tableau
		System.out.println("1er �l�ment est: " + tableau[0]);

		//Afficher le dernier �l�ment du tableau en utilisant la propri�t� length
		System.out.println("dernier �l�ment est: " + tableau[tableau.length-1]);
		
		//� quel index est situ� l�entier 5 ?
		System.out.println("L'entier 5 est situ� � l'index 4");
		
		//Afficher l��l�ment d�index 10. Que se passe t�il ? Pourquoi ?
		System.out.println("�l�ment d'index 10: " + tableau[10]);
			
		//Modifier la valeur de l��l�ment d�index 4 et donner lui la valeur 8
		tableau[4] = 8;
		
		
		
		
		
		
		
		
	}

}
