package fr.tableaux;


public class Exercice2 {

	public static void main(String[] args) {
		
		/* 
	    D�clarer un tableau de dimensions 2 avec une ligne contenant 
	    3 nombres quelconques et une seconde ligne contenant 5 nombres quelconques
	    Afficher la longueur du tableau en utilisant la propri�t� .length.
	    Afficher la longueur de la premi�re ligne en utilisant la propri�t� .length
	    Afficher la longueur de la derni�re ligne en utilisant la propri�t� .length
	    Afficher le premier �l�ment du tableau
	    Afficher le dernier �l�ment du tableau en utilisant la propri�t� length*/
		
		/*D�clarer un tableau de dimensions 2 avec une ligne contenant 
		3 nombres quelconques et une seconde ligne contenant 5 nombres quelconques*/
		int[][] tableau = {{1,2,3},{4,5,6,7,8}};
	
		
		//Afficher la longueur du tableau en utilisant la propri�t� .length. 
	
		System.out.println("la longueur du tableau est: " + tableau.length); 
				
		//Afficher la longueur de la premi�re ligne en utilisant la propri�t� .length
		System.out.println("la longueur de la 1er ligne est: " + tableau[0].length);
		
		//Afficher la longueur de la derni�re ligne en utilisant la propri�t� .length
		System.out.println("la longueur de la 1er ligne est: " + tableau[1].length);
				
		//Afficher le premier �l�ment du tableau
		System.out.println("1er �l�ment du tableau est: " + tableau[0][0]);
		
		//Afficher le dernier �l�ment du tableau
		System.out.println("le dernier �l�ment du tableau est: " + tableau[1][4]);
		
	
		
		

	}

}
