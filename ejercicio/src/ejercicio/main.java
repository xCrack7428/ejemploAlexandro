package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;




public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> prueba=new ArrayList <String>();
		
		
		prueba.add(null);
		prueba.add(null);
		prueba.add(null);	
		prueba.add(null);	

	

	Iterator<String> hola= prueba.iterator();
	while(hola.hasNext()) {
		
		System.out.println(hola.next());
	}
	}
}
