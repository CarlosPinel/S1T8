package N202;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Programa un mètode que retorna una cadena separada per comes, basada en una
 * llista d’Integers. Cada element ha d’anar precedit per lletra “e” si el
 * nombre és parell, o per la lletra “o” si el nombre és imparell. Per exemple,
 * si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”.
 * Imprimeix el resultat.
 * 
 * @author Carlos
 *
 */

public class MainN202 {

	public static void main(String[] args) {

		ArrayList<Integer> listaInte = new ArrayList<Integer>();
		listaInte.add(2);
		listaInte.add(55);
		listaInte.add(102);
		listaInte.add(3);
		
		ArrayList<Integer> listaAux = new ArrayList<Integer>(listaInte);
		
		// expresión lambda sin metodo propio
		listaAux.forEach((n) -> {
			String mensaje = "";
			if (n % 2 == 0) {
				mensaje = ("e" + n + ",");
			} else {
				mensaje = ("o" + n + ",");
			}
			System.out.print(mensaje);
		});
		
		// salida de metodo propio( con lambda)
		System.out.println(listaNumeros(listaAux));
		
		// expresion lambda con metodo propio (sin lambda)
		listaInte.forEach((n) -> System.out.print(met1(n)));
	}
	
	// Metodo propio con expresion lambda
	public static String listaNumeros(ArrayList<Integer> listaInte) {
		
		return listaInte.stream().map((n) -> (n % 2 == 0) ? "e" + n : "o" + n).collect(Collectors.joining(","));
	}
	
	// Metodo propio sin lambda
	public static String met1(Integer n) {
		String mensaje = "";
		if (n % 2 == 0) {
			mensaje = ("e" + n + ",");
		} else {
			mensaje = ("o" + n + ",");
		}
	return mensaje;
	}
}
