package N102;

import java.util.ArrayList;

/**
 * Has de fer el mateix que en el punt anterior, però ara, el mètode ha de
 * retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també
 * tenen més de 5 lletres. Imprimeix el resultat.
 * 
 * @author Carlos
 *
 */

public class MainN102 {

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
			.filter((n) -> n.length()>5)
			.forEach((n) -> System.out.println(n));
	}
}
