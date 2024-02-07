package ui;

import java.util.Scanner;

public class uu {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("dime un dia");
		String dia= sc.next();
		
		switch(dia) {
		
		case "lunes", "martes", "miercoles", "jueves", "viernes":
			System.out.println("Dia de semana");
		break;
		case "sabado", "domingo":
			System.out.println("fin de semana");
			break;
	}
	}
}




	
