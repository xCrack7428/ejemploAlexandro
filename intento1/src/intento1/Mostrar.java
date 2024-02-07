package intento1;

public class Mostrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Fecha fecha=new Fecha(12, 30, 5);
Hora hora=new Hora(17, 40);		
Examen nuevo=new Examen(fecha, hora, "religion", "aula culo");

System.out.println(nuevo.toString());



	}

	
}
