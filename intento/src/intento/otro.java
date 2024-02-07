package intento;

import java.util.ArrayList;
import java.util.Iterator;

public class otro {
	private ArrayList<String> lista;

    public otro() {
        // Inicialización del ArrayList en el constructor
        lista = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        lista.add(elemento);
    }

    public void mostrarElementos() {
        // Obtener un Iterator para el ArrayList
        Iterator<String> iterator = lista.iterator();

        // Recorrer la lista usando el Iterator
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }
    }

}
