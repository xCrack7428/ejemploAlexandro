package opera;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pri = 0;
		int sec = 0;
		int resultado;

		pri = sc.nextInt();

		System.out.println("primer num: " + pri);
		sec = sc.nextInt();

		System.out.println("segundo num: " + sec);
		System.out.println("elige sumar, restar, multiplicar, dividir");
		String opera;
		opera = sc.next();
		switch (opera) {
		case "+":
			resultado = pri + sec;
			System.out.println(resultado);
			break;
		case "-":
			if (sec < 100) {
				sec = sec + 2;
			}
			resultado = pri - sec;
			System.out.println(resultado);
			break;
		case "*":
			resultado = pri * sec;
			System.out.println(resultado);
			break;
		case "/":
			resultado = pri / sec;
			System.out.println(resultado);
			break;
		}

	}

}
