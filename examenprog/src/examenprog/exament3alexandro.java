package examenprog;

import java.util.Scanner;

public class exament3alexandro {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
//me deje la primera parte del while porque me daba errores por todas partes, asi que hice las demas//
		//Esto es para hacer que si tiene mas de 10 characteres haga lo siguiente//
		String cadena1="No se que hacer";
		int cadena2=cadena1.length();
		if(cadena1.length()>10) {
		System.out.println(cadena2);		
	}
		
		//Para comparar si son iguales o no se pondria el equals mas las variables y eso es lo que sucede en cada caso//
		String ejemplo1;
		System.out.println("Dime la primera frase");
		ejemplo1=sc.nextLine();
		String ejemplo2;
		System.out.println("Dime la segunda frase");
		ejemplo2=sc.nextLine();
		if(ejemplo1.equals(ejemplo2)) {
			System.out.println(ejemplo1.toUpperCase());
			}else {
				System.out.println(ejemplo1.toLowerCase());
			}
		
		//Aqui hice para que cambiasen las letras a por las letras i//
		String cambiar="para que";
		cambiar=sc.nextLine();
		System.out.println(cambiar.replace('a', 'i'));
		
		//Dos numeros randoms del uno al diezy que se sumen//
		int random=(int) (Math.random()*10);
		int random2=(int) (Math.random()*10);
		System.out.println(random);
		System.out.println(random2);
		System.out.println(random+random2);
		
		//convertir el String en float//
		String cadenatext = null;
		float valor=Float.parseFloat(cadenatext);
		
		
	}

	}

