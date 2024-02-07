package dinero;

import java.util.Scanner;

public class euros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Escribe el tipo de tarjeta");
		
		
		int tarjeta = 0;
		tarjeta=sc.nextInt();
	
	      boolean dinero = false;
	        do {
	            System.out.println("Escribe el tipo de tarjeta");
	            tarjeta = sc.nextInt();
	            switch (tarjeta) {
	                case 4:
	                    System.out.println("Tu tarjeta sera VISA");
	                    dinero = false;
	                    break;
	                case 5:
	                    System.out.println("Tu tarjeta sera Mastercard");
	                    dinero = false;
	                    break;
	                case 3:
	                    System.out.println("Tu tarjeta sera American espress");
	                    dinero = false;
	                    break;
	                default:
	                    System.out.println("ERROR");
	                    dinero = true;
	            }

	        } while (dinero == true);

		long codigo;
		System.out.print("Escribe el codigo de la tarjeta");
		codigo=sc.nextLong();
		System.out.print("Introduce a pagar");
		int total;
		
		total=sc.nextInt();
		
		int pago = 0;
		System.out.print("Introduce lo que desea pagar");
		pago=sc.nextInt();
		
		int devuelta;
		devuelta=total-pago;
		
		System.out.println("DEVOLUCION: " +devuelta);
		
		while(pago>total) 
		{
		int €100=(devuelta / 100);
	
		
		int €50 = (devuelta / 50);
	
		
		int €20 = (devuelta / 20);
		
		
		int €10 = (devuelta / 10);
		
		
		int €5 = (devuelta / 5);
	
	
		int €2 = (devuelta / 2);
	
	
		int €1 = (devuelta / 1);
		
		double cent50= (devuelta / 0.5);
	
		double cent20= (devuelta / 0.2);
		
		double cent10= (devuelta / 0.1);
		
		double cent5= (devuelta / 0.05);
		
		double cent2= (devuelta / 0.02);
		
		double cent1= (devuelta / 0.01);
		
		System.out.println(€100 +"billetes de 100");
		System.out.println(€50 +"billetes de 50");
		System.out.println(€20 +"billetes de 20");
		System.out.println(€10 +"billetes de 10");
		System.out.println(€5 +"billetes de 5");
		System.out.println(€2 +"monedas de 2");
		System.out.println(€1 +"monedas de 1");
		System.out.println(cent50 +"monedas de 50 centimos");
		System.out.println(cent20 +"monedas de 20 centimos");
		System.out.println(cent10 +"monedas de 10 centimos");
		System.out.println(cent5 +"monedas de 5 centimos");
		System.out.println(cent2 +"monedas de 2 centimos");
		System.out.println(cent1 +"monedas de 1 centimos");
		break;
	}
					
					
					
					
					
					
	}
					}
	
