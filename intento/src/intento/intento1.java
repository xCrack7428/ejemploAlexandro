package intento;
import java.util.ArrayList;
import java.util.Iterator;


public class intento1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> boludo=new ArrayList<String>();
		
		boludo.add("lechugas");
		boludo.add("tomates");
		boludo.add("cebollas");
		boludo.add("zanahorias");
		boludo.add("melenas");

		System.out.println(boludo);

		
		
		Iterator<String> boludo2=boludo.iterator();
		while(boludo2.hasNext()) {
			System.out.println(boludo2.next());
		}
	
	
	}

}
