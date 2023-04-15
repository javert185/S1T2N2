package s1t2n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	public static byte llegirByte(String missatge) throws InputMismatchException{
		
		Scanner sc = new Scanner(System.in);
		
		Byte res_byte = null;
		
		while (res_byte == null) {
			
			try {
				System.out.println(missatge);
				res_byte = sc.nextByte();	
			} catch (InputMismatchException e) {
				
				System.out.println("Error de format: Has d'introduir una dada byte");
				sc.nextLine();
			}			
		}
		
		
		return res_byte;
	}
	public static int llegirInt(String missatge) throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);
		
		Integer res_int = null;
		
		while (res_int == null) {
			
			try {
				System.out.println(missatge);
				res_int = sc.nextInt();	
			} catch (InputMismatchException e) {
				
				System.out.println("Error de format: Introdueix una dada int");
				sc.nextLine();
			}			
		}
						
		return res_int;
	}
	
	public static float llegirFloat(String missatge) throws InputMismatchException {

		Scanner sc = new Scanner(System.in);
		
		Float res = null;
		
		while (res == null) {
			
			try {
				System.out.println(missatge);
				res = sc.nextFloat();	
			} catch (InputMismatchException e) {
				
				System.out.println("Error de format: Introdueix una dada float");
				sc.nextLine();
			}			
		}
						
		return res;
	}
	
	public static double llegirDouble(String missatge) throws InputMismatchException{

		Scanner sc = new Scanner(System.in);
		
		Double res = null;
		
		while (res == null) {
			
			try {
				System.out.println(missatge);
				res = sc.nextDouble();	
			} catch (InputMismatchException e) {
				
				System.out.println("Error de format: Introdueix una dada double");
				sc.nextLine();
			}			
		}
						
		return res;
	}
	
	public static char llegirChar(String missatge) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		char res_ch = '\0';
		
		while (res_ch == '\0') {
			
			try {
				System.out.println(missatge);
				res_ch = sc.next().charAt(0);	
			} catch (Exception e) {
				
				System.out.println("Error de format: Introdueix una dada char");
				sc.nextLine();
			}			
		}
						
		return res_ch;
	}
	
	public static String llegirString(String missatge) {
		
		Scanner sc = new Scanner(System.in);
		
		String res = null;
		
		while (res == null) {
			
			try {
				System.out.println(missatge);
				res = sc.nextLine();	
			} catch (Exception e) {
				
				System.out.println("Error de format: Introdueix una dada String");
				sc.nextLine();
			}			
		}
						
		return res;
	}
	
	public static boolean llegirSiNo(String missatge) {

		Scanner sc = new Scanner(System.in);
		
		char res = '\0';
		
		while (res == '\0') {
			
			try {
				System.out.println(missatge);
				res = sc.next().charAt(0);	
			} catch (Exception e) {
				
				System.out.println("Error de format: Introdueix \"s\" o \"n\"");
				sc.nextLine();
			}	
			
			if (res != 's' && res != 'n') {
				res = '\0';
			} 
		}
		
		if (res == 'n') {
			return false;
		}
		else {
			return true;
		}
	}

}
