package familia;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		family2 padre=new family2("Paco","hombre","calle dos", 2000, 2023);
		family2 madre=new family2("Maria","mujer","calle dos", 1999, 2023);
		family2 seghijo=new family2("Pepe","hombre","calle dos", 2013, 2023);
		family2 terhijo=new family2("Isabel","mujer","calle dos", 2010, 2023);
		
	System.out.println("PADRE");
	System.out.println(padre.nombre);
	System.out.println(padre.genero);
	System.out.println(padre.direccion);
	System.out.println(padre.fechaini);
	System.out.println(padre.fechaact);
	
	System.out.println("MADRE");
	System.out.println(madre.nombre);
	System.out.println(madre.genero);
	System.out.println(madre.direccion);
	System.out.println(madre.fechaini);
	System.out.println(madre.fechaact);

	System.out.println("SEGUNDO HIJO");
	System.out.println(seghijo.nombre);
	System.out.println(seghijo.genero);
	System.out.println(seghijo.direccion);
	System.out.println(seghijo.fechaini);
	System.out.println(seghijo.fechaact);

	System.out.println("TERCER HIJO");
	System.out.println(terhijo.nombre);
	System.out.println(terhijo.genero);
	System.out.println(terhijo.direccion);
	System.out.println(terhijo.fechaini);
	System.out.println(terhijo.fechaact);



	
	}

}
