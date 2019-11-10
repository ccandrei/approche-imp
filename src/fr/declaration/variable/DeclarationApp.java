package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		
		
		// TP approche-imperative variable primitifs
		
		byte b = 120;
		System.out.println(b);
		
		short s = -32700;
		System.out.println(s);
		
		int i = 1000000;
		System.out.println(i);
		
		long l = 9220000000000000000L;
		System.out.println(l);
		
		float f = 1.45648f;
		System.out.println(f);
		
		double d = 100_000_000;
		System.out.println(d);
		
		char c = '\u20ac';
		System.out.println(c);
		char c1 = 65;
		System.out.println(c1);
		char c2 = '\b';
		System.out.println(c2);
		
		boolean o = true; 
		System.out.println(o);
		
						
	// string variable test
	
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		System.out.println(randomString);	
		
		String guillemets = "Une chaine avec\"";
		System.out.println(guillemets);	
		
		String guillemets2 = "Un \u0153";
		System.out.println(guillemets2);	

	}

}
