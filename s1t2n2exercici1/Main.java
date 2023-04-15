package s1t2n2exercici1;

public class Main {

	public static void main(String[] args) throws Exception {		
						
		//Mètode byte
		byte res = Entrada.llegirByte("Introdueix qualsevol byte");
		System.out.println("Has introduit el byte " + res + "\n");
		
		//Mètode int
		int res1 = Entrada.llegirInt("Introdueix qualsevol int");
		System.out.println("Has introduit l'int " + res1 + "\n");

		//Mètode float
		float res2 = Entrada.llegirFloat("Introdueix qualsevol float");
		System.out.println("El número introduit és " + res2 + "\n");

		//Mètode double
		Double res3 = Entrada.llegirDouble("Introdueix qualsevol double");
		System.out.println("Has introduit el double " + res3 + "\n");
		
		//Mètode Char
		char res4 = Entrada.llegirChar("Introdueix qualsevol char");
		System.out.println("Has introduit el char " + res4 + "\n");
		
		//Mètode String
		String res5 = Entrada.llegirString("Introdueix qualsevol string");
		System.out.println("Has introduit l'string " + res5 + "\n");
		
		//Mètode boolean
		boolean res6 = Entrada.llegirSiNo("Introdueix \"s\" per true o introdueix \"n\" per false");
		System.out.println("La resposta és " + res6 + "\n");
		}
}