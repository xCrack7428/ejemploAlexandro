import java.util.ArrayList;
import java.util.Iterator;

public class lista2 {

	public static void mostrar(Iterator pa, String palabra) {
		int posicion=0;
		System.out.println(palabra);
		palabra="hola";
		while(pa.hasNext()) {
			System.out.println(palabra+","+pa.hasNext());
			posicion++;
		}
	}
}
