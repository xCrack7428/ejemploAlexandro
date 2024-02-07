package TRABAJO;

import java.util.Date;

/**
 * 
 *@author Alexandro 
 *
 */
public class Cliente 
{
public static String Productoeliminado;
public static String eliminarProducto1;
 String nombre;
 String apellido;
 String Direccion;
 int Historial;
 private Date FechaDeAlta;
 int Telefono;
 int CodigoPedido=(int) (Math.random()*1000000);
 static String agregarPedido;
 
 
 public Cliente(String nombre, String apellidos, String Direccion, int Historial, Date FechaDeAlta, int Telefono, String apellido) 
 {
	 this.nombre=nombre;
	 this.apellido=apellido;
	 this.Direccion=Direccion;
	 this.Historial=Historial;
	 this.FechaDeAlta=FechaDeAlta;
	 this.Telefono=Telefono;
 }
 
 
 
 public String getNombre() 
 {
	return nombre;
}



public void setNombre(String nombre) 
{
	this.nombre = nombre;
}



public String getApellido() 
{
	return apellido;
}



public void setApellido(String apellido) 
{
	this.apellido = apellido;
}



public Date getFechaDeAlta() 
{
	return FechaDeAlta;
}



public void setFechaDeAlta( Date FechaDeAlta) 
{
	this.FechaDeAlta = FechaDeAlta;
}



public static void agregarPedido(String Pedido) 
{
	 System.out.println(Pedido);
}
}
 
 