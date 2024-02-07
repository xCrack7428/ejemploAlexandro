	package TRABAJO;

import java.util.Date;
import java.util.Objects;

/**
 * 
 *@author Alexandro 
 *
 */
public class Producto {
static String Nombre;
static double Precio;
static double preciofinal;
static int Cantidad;
static double precio1;
static double precio2;



public Producto(String Nombre, double Precio, int Cantidad) 
{
	this.Nombre=Nombre;
	this.Precio=Precio;
	this.Cantidad=Cantidad;
}

public Producto(String Nombre, double precio1) 
{
	this.precio1=precio1;
	
}
public String Producto2(String Nombre, double precio2) 
{
	this.precio2=precio2;
	return Nombre;
}

public String getNombre() 
{
return Nombre;
}

public static void setNombre(String nombre) 
{
	Nombre = Nombre;
}


public static double getPrecio() 
{
return Precio;
}

public static void setPrecio(Float precio) 
{
	Precio = precio;
}

public static double getPreciofinal() 
{
	preciofinal=Precio*Cantidad;
	return preciofinal;
}

public static void setPreciofinal(double preciofinal) 
{
	Producto.preciofinal = preciofinal;
	
}

public static int getCantidad() 
{
	return Cantidad;
}

public static void setCantidad(int cantidad) 
{
	Cantidad = cantidad;
}
@Override
public String toString() {
	return "Producto [Nombre=" + getNombre() + "												 Precio=" + getPrecio() + "\nCantidad =" + getCantidad() + ","+ "												  			 Precio final=" + getPreciofinal()+ "]";
}
}
