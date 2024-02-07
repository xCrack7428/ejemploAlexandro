package sinbuscar;

import java.util.Scanner;

public class Buscar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**Sin buscar en internet
Escribe un programa con varios apartados:
1) que cuente el número de vocales que aparecen en un texto que se solicita al usuario.
2) que invierta la cadena de texto y la saque por pantalla
por defecto que salga un chiste(a tu gusto).*/
		
		
		
		
		Scanner sc=new Scanner(System.in);

		String palabra; 
		System.out.println("Dime una palabra");
		
		char a = 0;
		char e = 0;
		char i = 0;
		char o = 0;
		char u = 0;
		
		palabra=sc.nextLine();
		palabra=palabra.toLowerCase();
		int tamaño=palabra.length();
		
		System.out.println();
		
		char menu=sc.next().charAt(0);
		switch(menu) {
		case'1':
			for(int i1 = 0 ;i1<tamaño;i1++) {
				
				if(palabra.charAt(i1) == 'a') {
					a++;
				}else if (palabra.charAt(i1)== 'e') {
					e++;
				}else if (palabra.charAt(i1)== 'i') {
					i1++;
				}else if (palabra.charAt(i1)== 'o') {
					o++;
				}else if (palabra.charAt(i1)== 'u') {
					u++;
				}
				palabra.charAt(i1);
			}
			
			System.out.println("El resultado es\n"+ "A: " + a + "E" + e + "i" + i +"o" + o +"u" + u );
		}
		
		

	



}
}
