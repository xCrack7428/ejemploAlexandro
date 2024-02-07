package loes;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personaa gente[]=new Personaa[4];
	
	
		gente[0]=new Personaa("pepe", 20);
		gente[1]=new Personaa("jose", 25);
		gente[2]=new Personaa("maria", 30);
		gente[3]=new Personaa("raul", 35);

		for(int i=0;i<gente.length;i++) {
			gente[i].mostrar();
		}

		
	}

}
