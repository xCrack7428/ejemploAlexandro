package ejrcicio;

import java.util.Scanner;

public class Numeros {



		public static void filtro(int elarray[]) {
	
for(int i =0;i<elarray.length;i++) {
	if(elarray[i] >= -3 && elarray[i] <=3) {
		System.out.println("numero filtrado:" +elarray[i]);
		
	}
}
		
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("cuantos numeros tendras?");
		int cantidad=sc.nextInt();
		int elarray[]=new int [cantidad];
		for (int i =0;i<cantidad;i++) {
			System.out.println("dime el "+ (i+1)+ "ºnumero");
			elarray[i]=sc.nextInt();
			}
		filtro(elarray);
	}

}
