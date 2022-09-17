package N203;

/**
 * Crea una Functional Interface que contingui un mètode anomenat operacio().
 * Aquest mètode ha de retornar un float. Injecta a la interfície creada
 * mitjançant una lambda, el cos del mètode, de manera que es pugui transformar
 * l’operació amb una suma, una resta, una multiplicació i una divisió.
 * 
 * @author Carlos
 *
 */

public class MainN203 {

	public static void main(String[] args) {

		// Con Interfaz 1, (tipo dialogo)
		
		InferfazFuncionalN203v1 gestorOperaciones = (n1, n2, op) -> {
			float resultado = 0f;
			if (op.equalsIgnoreCase("suma")) {
				resultado = (n1 + n2);
			} else if (op.equalsIgnoreCase("resta")) {
				resultado = (n1 - n2);
			} else if (op.equalsIgnoreCase("multiplicacion")) {
				resultado = (n1 * n2);
			} else if (op.equalsIgnoreCase("division")) {
				resultado = (n1 / n2);
			}
			return resultado;
		};

		float resultado = gestorOperaciones.operacion(4, 3, "suma");
		System.out.println(resultado);

		// Con interfaz2, transformando la operacion de la interfaz
		
		InterfazFuncionalN203v3 suma = (n1, n2) -> n1 + n2;
		InterfazFuncionalN203v3 resta = (n1, n2) -> n1 - n2;
		InterfazFuncionalN203v3 multiplicacion = (n1, n2) -> n1 * n2;
		InterfazFuncionalN203v3 division = (n1, n2) -> n1 / n2;

		System.out.println(suma.operacion(6, 8));
		System.out.println(resta.operacion(6, 8));
		System.out.println(multiplicacion.operacion(6, 8));
		System.out.println(division.operacion(6, 8));
	}
}
