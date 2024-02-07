package examenprog;

import java.util.Scanner;

public class exament2alexandro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//aqui se muestra por pantalla estas variables que cree pero el char no me acordaba como hacerlo, puse los metodos debajo de cada uno para evitarme errores y que sea mas comodo y ordenado//
		Scanner sc=new Scanner(System.in);
		final int constante = 0;
		int entero;
		System.out.println("Dime un numero entero");
		entero=sc.nextInt();
		int num2 = 0;
		System.out.println("Dime un numero entero que se calculara con el primero elegido");
		num2=sc.nextInt();
		while (num2<10) {
			System.out.println("Dime otro numero");
			break;	
		}
		while (num2<10) {
			System.out.println("La suma de los numero es:" +entero+num2);
			break;
	}
		float decimal;
		char letra;
		boolean opcion;
		opcion=sc.nextBoolean();
		while(opcion==true) {
			System.out.println("Cambia la condicion");
			break;
		}
		System.out.println("Dime un numero decimal float");
		decimal=sc.nextFloat();
		System.out.println("Dime un booleano");
		
			
		
	}
	}
