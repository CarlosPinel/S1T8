package N201;

import java.util.ArrayList;

/**
 * 
 * Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una
 * llista de totes les cadenes que comencen amb la lletra 'A' (majúscula) i
 * tenen exactament 3 lletres. Imprimeix el resultat.
 * 
 * @author Carlos
 *
 */
public class MainN201 {

	public static void main(String[] args) {

		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Ana");
		listaNombres.add("Anabella");
		listaNombres.add("Andres");
		listaNombres.add("Jose");
		listaNombres.add("Marta");
		listaNombres.add("Carlos");
		listaNombres.add("Ari");
		
		ArrayList<String> listaAux1 = new ArrayList<String>(listaNombres);
		listaAux1.stream()
		.filter((n) -> n.charAt(0) == 'A')
		.filter((n) -> n.length() == 3)		
		.forEach(System.out::println);
	}
}
