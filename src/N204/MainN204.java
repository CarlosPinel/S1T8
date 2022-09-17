package N204;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Crea una llista que contingui algunes cadenes de text i nombres.
 * 
 * Ordena-les per: Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna
 * el codi numèric del primer caràcter) Les cadenes que contenen una "e" primer,
 * la resta de cadenes després. Posa el codi directament a la lambda. Modifica
 * tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
 * Mostra només els elements que són numèrics. (Encara que estiguin guardats com
 * Strings).
 * 
 * @author Carlos
 *
 */
/**
 * @param args
 */
public class MainN204 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("estar");
		lista.add("8");
		lista.add("ojo");
		lista.add("caramelo");
		lista.add("bocadillo");
		lista.add("7");
		lista.add("43");
		lista.add("carlos");
		
		List<String> listaAux1 = lista.stream().sorted((n1,n2)-> n1.charAt(0)-n2.charAt(0)).collect(Collectors.toList());
		System.out.println(listaAux1);
		List<String> listaAux2 = listaAux1.stream().sorted(Comparator.comparing((n)-> !n.contains("e"))).collect(Collectors.toList());
		System.out.println(listaAux2);
		List<String> listaAux3 = lista.stream().map((n)-> n.replace("a", "4")).collect(Collectors.toList());
		System.out.println(listaAux3);
		listaAux3.stream().filter((n)-> n.matches("[0-9]+")).forEach(System.out::println); //uno del 0 al 9 o mas de uno
		listaAux3.stream().filter((n)-> n.matches("\\d+")).forEach(System.out::println); //uno o mas digitos
		
	}
}
		
//		-------------- APUNTES ---------------------

//		ArrayList<String> lista2 = new ArrayList<String>();
//		ArrayList<String> lista3 = new ArrayList<String>();
//
//		//Con lambdas v.1
//		Collections.sort(lista, (s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)));
//		Collections.sort(lista, (s1, s2) -> {
//			if (s1.contains("e") && !s2.contains("e")) {
//				return -1;
//			} else if (s1.contains("e") && s2.contains("e")) {
//				return 0;
//			} else {
//				return 1;
//			}
//		});
//		lista.forEach((s) -> lista2.add(s.replace('a', '4')));
//		lista2.forEach((n) -> System.out.println(n));
//		lista2.forEach((n) -> {
//			if (esNumero(n)) {
//				lista3.add(n);
//			};
//		});
//		lista3.forEach((n) -> System.out.println(n));
		
//		List<String> listaOrdenada1 = lista.stream().sorted(Comparator.comparing(p->p.charAt(0))).collect(Collectors.toList());
//		System.out.println(listaOrdenada1);
//		List<String> listaOrdenada2 = lista.stream().sorted(Comparator.comparing(p->!p.contains("e"))).collect(Collectors.toList());
//		System.out.println(listaOrdenada2);
//		List<String> listaOrdenada3 = lista.stream().sorted(Comparator.comparing(p->p.charAt(0)).thenComparing(Comparator.comparing(p->!p.contains("e"))));
		
		
		
//		lista.sort(Comparator.comparing(p->p.charAt(0)));
//		System.out.println(lista);
//		lista.sort(Comparator.comparing(p->!p.contains("e")));
//		System.out.print(lista);
//		
//		System.out.println(lista);
		
		//Sin lambdas
		/*
		 * Collections.sort(lista); 
		 * Collections.sort(lista, new MyComparator()); 
		 * for ( String s : lista) { 
		 * lista2.add(s.replace('a', '4')); 
		 * }
		 * System.out.println(lista2); 
		 * for (String s : lista2) { 
		 * if (esNumero(s)) {
		 * lista3.add(s); 
		 * } 
		 * } ; 
		 * System.out.println(lista3);
		 */
//	}
//
//	// Metodos generales
//	private static class MyComparator implements Comparator<String> {
//		@Override
//		public int compare(String s1, String s2) {
//			int resultado = 0;
//			if (s1.charAt(0) == 'e' && s2.charAt(0) != 'e') {
//				resultado = -1;
//			} else if (s1.charAt(0) == 'e' && s2.charAt(0) == 'e') {
//				resultado = 0;
//			} else {
//				resultado = 1;
//			}
//			return resultado;
//		}
//
//	}
//
//	private static boolean esNumero(String string) {
//		try {
//			Integer.parseInt(string);
//			return true;
//		} catch (NumberFormatException e) {
//			return false;
//		}
//	}
