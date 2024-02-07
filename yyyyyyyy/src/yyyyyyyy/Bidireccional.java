package yyyyyyyy;

public class Bidireccional {
	
		public static void mostrar(int array[][]){
		int fila,columna,tamFilas,tamColumnas;
		tamFilas=array.length; // Tamaño de las filas
		tamColumnas=array[0].length; // Tamaño de las columnas
		for(fila=0;fila<tamFilas;fila++){
		for(columna=0;columna<tamColumnas;columna++){
		// Importante hacerlo con print para que se vea bien
		System.out.print(array[fila][columna]+" ");
		}
		// Importante hacer aquí un println para que baje de
		// línea una vez hemos impreso una fila
		System.out.println();
		}
		}
		public static void main(String[] args) {
		int bidi[][]=new int [3][5];
		bidi[1][3]=7;
		bidi[0][4]=-3;
		bidi[2][2]=9;
		bidi[1][0]=1;
		mostrar(bidi);
		}
		}

