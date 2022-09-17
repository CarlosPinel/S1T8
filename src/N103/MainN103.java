package N103;

import java.util.ArrayList;

/**
 * Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements
 * de la llista amb una lambda.
 * 
 * @author Carlos
 *
 */

public class MainN103 {

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
		.forEach((n) -> System.out.println(n));
	}
	
	public static void crearAnadirMes(String mes, ArrayList<String> listaMeses) {
		listaMeses.add(mes);
	}
}
