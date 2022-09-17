package N104;

import java.util.ArrayList;

/**
 * Fer la mateixa impressió del punt anterior, però mitjançant method reference.
 * 
 * @author Carlos
 *
 */

public class MainN104 {

	public static void main(String[] args) {

		ArrayList<String> listaMeses = new ArrayList<String>();
		crearAnadirMes("Enero", listaMeses);
		crearAnadirMes("Febrero", listaMeses);
		crearAnadirMes("Marzo", listaMeses);
		crearAnadirMes("Abril", listaMeses);
		crearAnadirMes("Mayo", listaMeses);
		crearAnadirMes("Junio", listaMeses);
		crearAnadirMes("Julio", listaMeses);
		crearAnadirMes("Agosto", listaMeses);
		crearAnadirMes("Septiembre", listaMeses);
		crearAnadirMes("Octubre", listaMeses);
		crearAnadirMes("Noviembre", listaMeses);
		crearAnadirMes("Diciembre", listaMeses);

		listaMeses.stream()
		.forEach(System.out::println);
	}

	public static void crearAnadirMes(String mes, ArrayList<String> listaMeses) {
		listaMeses.add(mes);
	}
}