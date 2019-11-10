package fr.tableaux;


public class Exercice2 {

	public static void main(String[] args) {
		
		/* 
	    Déclarer un tableau de dimensions 2 avec une ligne contenant 
	    3 nombres quelconques et une seconde ligne contenant 5 nombres quelconques
	    Afficher la longueur du tableau en utilisant la propriété .length.
	    Afficher la longueur de la première ligne en utilisant la propriété .length
	    Afficher la longueur de la dernière ligne en utilisant la propriété .length
	    Afficher le premier élément du tableau
	    Afficher le dernier élément du tableau en utilisant la propriété length*/
		
		/*Déclarer un tableau de dimensions 2 avec une ligne contenant 
		3 nombres quelconques et une seconde ligne contenant 5 nombres quelconques*/
		int[][] tableau = {{1,2,3},{4,5,6,7,8}};
	
		
		//Afficher la longueur du tableau en utilisant la propriété .length. 
	
		System.out.println("la longueur du tableau est: " + tableau.length); 
				
		//Afficher la longueur de la première ligne en utilisant la propriété .length
		System.out.println("la longueur de la 1er ligne est: " + tableau[0].length);
		
		//Afficher la longueur de la dernière ligne en utilisant la propriété .length
		System.out.println("la longueur de la 1er ligne est: " + tableau[1].length);
				
		//Afficher le premier élément du tableau
		System.out.println("1er élément du tableau est: " + tableau[0][0]);
		
		//Afficher le dernier élément du tableau
		System.out.println("le dernier élément du tableau est: " + tableau[1][4]);
		
	
		
		

	}

}
