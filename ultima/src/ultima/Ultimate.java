package ultima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ultimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	LinkedList <String> espabila=new LinkedList<String>();
	
	
	espabila.add("jw");
	espabila.add("hola");
	Ultimate.hola(espabila.iterator());

	}
	public static void hola(Iterator<String> sino) {
		while(sino.hasNext()) {
			System.out.println(sino.next());
		}
	}
}

