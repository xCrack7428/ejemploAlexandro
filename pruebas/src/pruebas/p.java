package pruebas;

import java.util.Scanner;

public class p {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int calse,w;
		calse=sc.nextInt();
		switch(calse) {
		case 1:
			System.out.println("hola");
		
			w=sc.nextInt();
			switch(w) {
				case 1:
					System.out.println("o");
				break;
				default:
				System.out.println("....");
			break;
			}
		break;
		case 2:
			System.out.println("m");
			break;

		
	}
		char h;
		h=sc.next().charAt(0);
		if(h=='p') {
			System.out.println("u");
			
		}else {
			System.out.println("error");
		}
}

	
}