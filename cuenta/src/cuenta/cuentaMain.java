package cuenta;

public class cuentaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cuenta.ponerNombreEmpresa("Empresa Andrés");
Cuenta pepe=new Cuenta("Pepe",50);
Cuenta maria=new Cuenta("Maria",50);

Cuenta daniel=new Cuenta("Daniel", 100);

pepe.mostrarCapitales();
maria.mostrarCapitales();
daniel.mostrarCapitales();


System.out.println("Beneficio(clase):"+Cuenta.beneficioAnual(0.1f));


pepe.ponerNombreEmpresa("Empresa Pepe");

maria.mostrarCapitales();

System.out.println("Beneficio (instancia):" +maria.beneficioAnual(0.2f));

pepe.mostrarCapitales();

	}

}
