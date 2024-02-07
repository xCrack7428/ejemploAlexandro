package array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int miarray []=new int [5];
		
		System.out.println(miarray + ""+miarray[1] + "" +miarray[4]);
		
		int miarray2[]= {1,5,2,7,-2};
		
		System.out.println(miarray2 + ""+miarray2[1] + "" +miarray2[4]);

		miarray[2]=3;
		
		for(int posicion=0; posicion<5; posicion++) {
			
			System.out.println("nota alumno" +posicion+":"+miarray[posicion]);

			
			int notas[]= {2,5,7,6,9};
			int notascopia[];
			//para direccionarme a la memoria (no copia)
			notascopia=notas;
			
			System.out.println(notas[3]);
			
			
			notascopia[3]=10;
			

			System.out.println(notas[3]);

			
			
			//para copiar
			notascopia=notas.clone();

			
			
		}
		
	}

}
