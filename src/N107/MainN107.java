package N107;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 
 * Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més
 * llarga a més curta.
 * 
 * @author Carlos
 *
 */

public class MainN107 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("murcielago");
		lista.add("8");
		lista.add("jamon");
		lista.add("7");
		lista.add("caribe");
		
		/*
		 * lista.sort( Comparator.comparing(String::length).reversed()); lista.stream()
		 * .forEach(System.out::println);
		 */
		
		ArrayList<String> listaAux1 = new ArrayList<String>(lista);
		listaAux1.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	}
}

	