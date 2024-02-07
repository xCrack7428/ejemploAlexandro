package ejerciciobidi;

public class ejer {

	
	
	
	
	public static void main(String[] args) {
	int a1[][]=
		{
		{2,8,4,1,7,9,3},
		{4,1,2,5,7,4,1},
		{2,8,4,1,7,9,3},
		{4,1,2,5,7,4,1},
		{7,2,11,54,4,1,1}
		};
	
	mostrar(a1);
	}
	public static void mostrar(int array[][]) {
		int filas, tamfilas, columna, tamcolumnas;
		filas=0;
		columna=0;
		tamfilas=array.length;
		tamcolumnas=array[0].length;
		int filasuma=0;
		for(filas=0;filas<tamfilas;filas++) {
			for(columna=0;columna<tamcolumnas;columna++) {
				System.out.print(array[filas][columna]);
				filasuma=filasuma+array[filas] [columna];
			}
			System.out.println();
			filasuma=0;
		
	}
		
}
	
		}
	


