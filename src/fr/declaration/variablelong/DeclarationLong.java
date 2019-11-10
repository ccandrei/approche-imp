package fr.declaration.variablelong;

public class DeclarationLong {

	public static void main(String[] args) {
		
		/* Le caractère L (ou l) est obligatoire pour 
		les litteraux dont la valeur est supérieure à 
		la limite max des int (2.1 milliards).*/
		
	long a = 3000L;
	System.out.println(a);
	
	long b = 3000;
	System.out.println(b);
	
	long c = 3000000000l;
	System.out.println(c);
		

	}

}
