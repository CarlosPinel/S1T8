package N106;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 
 * Crea una llista amb nombres i cadenes de text i ordena la llista amb les
 * cadenes de més curta a més llarga.
 * 
 * @author Carlo
 *
 */

public class MainN106 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("murcielago");
		lista.add("8");
		lista.add("jamon");
		lista.add("7");
		lista.add("caribe");
		
		/*
		 * lista.sort( Comparator.comparing(String::length)); lista.stream()
		 * .forEach(System.out::println);
		 */
		ArrayList<String> listaAux1 = new ArrayList<String>(lista);
		listaAux1.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
