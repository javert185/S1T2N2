package s1t2n2exercici1;

public class Main {

	public static void main(String[] args) throws Exception {		
						
		//M�tode byte
		byte res = Entrada.llegirByte("Introdueix qualsevol byte");
		System.out.println("Has introduit el byte " + res + "\n");
		
		//M�tode int
		int res1 = Entrada.llegirInt("Introdueix qualsevol int");
		System.out.println("Has introduit l'int " + res1 + "\n");

		//M�tode float
		float res2 = Entrada.llegirFloat("Introdueix qualsevol float");
		System.out.println("El n�mero introduit �s " + res2 + "\n");

		//M�tode double
		Double res3 = Entrada.llegirDouble("Introdueix qualsevol double");
		System.out.println("Has introduit el double " + res3 + "\n");
		
		//M�tode Char
		char res4 = Entrada.llegirChar("Introdueix qualsevol char");
		System.out.println("Has introduit el char " + res4 + "\n");
		
		//M�tode String
		String res5 = Entrada.llegirString("Introdueix qualsevol string");
		System.out.println("Has introduit l'string " + res5 + "\n");
		
		//M�tode boolean
		boolean res6 = Entrada.llegirSiNo("Introdueix \"s\" per true o introdueix \"n\" per false");
		System.out.println("La resposta �s " + res6 + "\n");
		}
}