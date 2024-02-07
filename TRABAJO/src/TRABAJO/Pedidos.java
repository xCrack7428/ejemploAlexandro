package TRABAJO;


/**
 * 
 *@author Alexandro 
 *
 */
public class Pedidos 
{
	public class Pedido 
	{
		
		 Cliente Cliente;
		 static Producto Producto1;
		 static Producto Producto2;
		 Float ImporteTotal;
		 PasarelaDePago Pago;
		 static String Estado;
		 String TipoPago;
		 static int mas;
		 static String agregarCliente;
		 static String agregarProducto1;
		 static String agregarProducto2;
		 static String eliminarProducto;
		 static Producto producto;
		 static int eliminacion;
		 
		 
		 public Pedido(Cliente Cliente, Producto Producto, Producto Producto2, Float ImporteTotal, PasarelaDePago Pago, String Estado, String TipoPago,int mas ) {
			 this.Cliente=Cliente;
			 this.Producto1=Producto1;
			 this.Producto2=Producto2;
			 this.ImporteTotal=ImporteTotal;
			 this.Pago=Pago;
			 this.Estado=Estado;
			 this.TipoPago=TipoPago;
		 }
		 

		//Voy a utilizar el public, lo que hace esta funcion es que al poner un nombre dentro se convierten en constantes
		 public enum Estado 
		 {
			 PAGADO, PREPARANDO, LISTO, SERVIDO
		 }
		 
		 public static Producto getProducto2() 
		 {
			return Producto2;
		}

		public static void setProducto2(String Producto2) 
		{
			Producto2 = Producto2;
		}
		

		public static Producto getProducto1() 
		{
			return Producto1;
		}

		public static void setProducto1(Producto producto1) 
		{
			Producto1 = producto1;
		}

		public static void agregarCliente(TRABAJO.Cliente cliente) 
		{
			cliente=cliente;
		}
		 
		 public static void agregarProducto1(Producto Producto) 
		 {
			 Producto1=Producto1;
			 if(Producto != null)
			      Producto1 =Producto;
			}
		
		 
		 public static void agregarProducto2(Producto Producto) 
		 {
			 Producto2=Producto2;

			   if(Producto != null && Producto1 != null)
				
			     Producto2 = Producto;
			 }

		
		 

		public static Producto eliminarProducto() 
		{
			Producto productoEliminado = producto;
			
			if (productoEliminado != null) 
			{
			    System.out.println("Producto eliminado: " + productoEliminado.getNombre());
			} else 
			{
			    System.out.println("No hay producto para eliminar.");
			}
	        return productoEliminado;
	    }

		public static void setagregarProducto1(String string) 
		{
			Pedido.agregarProducto1 = agregarProducto1;
			
		}
			
		public static String getagregarProducto1() 
		{
			return getagregarProducto1();
		}


		public static String getagregarProducto2() 
		{
			return getagregarProducto2();
		}

		public static void setagregarProducto2(String agregarProduct2) 
		{
			Pedido.agregarProducto2 = getagregarProducto2();
		}

		public static Producto getProducto(Producto producto) 
		{
			return producto;
		}

		public static void setProducto(Producto producto) 
		{
			Pedido.producto = producto;
			
		}
	}
	
}


		
	



		


