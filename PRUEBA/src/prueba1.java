package default;

public class Desayuno {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String tostada = "";
		String resultado = "";
		double precioComida = 0;
		double precioBebida = 0;
		// Comida
		
		System.out.print("¿ Que ha tomado de comer? (Croasant, Donut o Tostada):");
		String comida = s.nextLine();
		if (comida.equalsIgnoreCase("Tostada")) {
		System.out.print("¿ Con que se ha tomado el tostada? (aceite o tomate)":;
		(aceite o tomate): 
		tostada = s.nextLine();
		if (tostada.equalsIgnoreCase("aceite")) {
		resultado = "Tostada con aceite: 1,20 euros";
		precioComida = 1.20;
		} else if (tostada.equalsIgnoreCase("tomate")) {
		resultado = "Tostada con tortilla: 1,60 euros";
		precioComida = 1.60;
		}
		} else if (comida.equalsIgnoreCase("Croasant")) {
		resultado = "Croasant: 1,40 euros";
		precioComida = 1.40;
		} else if (comida.equalsIgnoreCase("Donut")) {
		resultado = "Donut: 1,00 euros";
		precioComida = 1.00;
		}
		// Bebida
		System.out.print("¿ Que ha tomado de beber? (zumo o cafe): ");
		String bebida = s.nextLine();
		if (bebida.equalsIgnoreCase("zumo")) {
		resultado += "\nZumo: 1,50 euros";
		precioBebida = 1.50;
		} else if (bebida.equalsIgnoreCase("cafe")) {
		resultado += "\nCafe: 1,20 euros";
		precioBebida = 1.20;
		}
		System.out.println(resultado);
		System.out.print("Total desayuno: ");
		System.out.print(precioComida + precioBebida);
		System.out.print(" euros");
		s.close();
		}
		
}

