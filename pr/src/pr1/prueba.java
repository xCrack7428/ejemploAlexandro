package pr1;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Dime tu edad");
		int edad= sc.nextInt();
		
		System.out.println("HOLA" +nombre+ "TIENEs"+ edad);
	}
}
