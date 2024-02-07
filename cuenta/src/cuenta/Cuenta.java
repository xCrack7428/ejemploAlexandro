package cuenta;

public class Cuenta {
static String nombreEmpresa;
static int capital=0;
static float beneficio=0;
int saldo;
String titular;


public Cuenta(String titular, int saldo) 
{
	this.titular=titular;
	this.saldo=saldo;
	capital=capital+saldo;
}

public static void ponerNombreEmpresa(String nombre) {
	nombreEmpresa=nombre;
}

public void mostrarCapitales() {
	System.out.println("El saldo "+titular+" es:"+saldo);
	System.out.println("El capital de la empresa " +nombreEmpresa+"es:"+(capital+beneficio));
}

public static float beneficioAnual(float TAE) {
	beneficio=beneficio+capital*TAE;
	return beneficio;
}
}
