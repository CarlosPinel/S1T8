package N101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A partir d’una llista de Strings, escriu un mètode que retorna una llista de
 * totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.
 *
 */

public class MainN101 {

	public static void main(String[] args) {

		ArrayList<String> listaStrings = new ArrayList<String>();
		String string1 = "hola";
		String string2 = "oso";
		String string3 = "caramelo";
		String string4 = "cabeza";
		listaStrings.add(string1);
		listaStrings.add(string2);
		listaStrings.add(string3);
		listaStrings.add(string4);

		ArrayList<String> listaAux1 = new ArrayList<String>(listaStrings);
		listaAux1.stream()
			.filter((n) -> n.contains("o"))
			.forEach((n) -> System.out.println(n));
		
		//Apuntes
		//Crear listas auxiliares para mantener la original
		ArrayList<String> listaAux = new ArrayList<String>(listaStrings);
		listaAux.sort((n1,n2) -> n1.compareTo(n2));
		System.out.println(listaAux);
		listaAux.stream().sorted((n1,n2) -> n1.compareTo(n2)).collect(Collectors.toList()).forEach(System.out::println);
		ArrayList<String> listaAux2 = new ArrayList<String>(listaStrings);
		listaAux2.stream().filter((n) -> n.contains("o")).collect(Collectors.toList()).forEach((n) -> System.out.println(n));
		System.out.println(listaAux2);
	}
}
